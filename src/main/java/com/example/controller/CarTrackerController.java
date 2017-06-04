package com.example.controller;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import com.example.domain.TracePoint;
import com.example.messaging.kafka.KafkaActivityProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;

import com.example.domain.CarActivityDTO;

@Slf4j
@Controller
public class CarTrackerController {

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	private final KafkaActivityProducer toKafka;

    public CarTrackerController(KafkaActivityProducer toKafka) {
        this.toKafka = toKafka;
    }

    @MessageMapping("/activity")
	public void sendActivity(@Payload CarActivityDTO dto) {
		Instant instant = Instant.ofEpochMilli(Calendar.getInstance().getTimeInMillis());
		dto.setTime(dateTimeFormatter.format(ZonedDateTime.ofInstant(instant, ZoneOffset.systemDefault())));
		dto.addTracePoint(TracePoint.builder()
				.name(this.getClass().getSimpleName())
				.time(System.currentTimeMillis())
				.build());

		log.debug("Sending car tracking data {}", dto);
		toKafka.send(dto);
	}
}
