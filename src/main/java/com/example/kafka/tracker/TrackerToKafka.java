package com.example.kafka.tracker;

import com.example.domain.tracker.AvroCarActivity;
import com.example.domain.tracker.AvroTracePoint;
import com.example.domain.tracker.TracePoint;
import com.example.util.AvroCodec;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;

import com.example.domain.tracker.CarActivityDTO;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.stream.Collectors;

@Slf4j
@Component
@EnableBinding(ActivitySource.class)
public class TrackerToKafka {
	
	private static final String CONTENT_TYPE_AVRO = "binary/avro";

	@Autowired
	private ActivitySource output;
	
	
	public void sendToKafka(CarActivityDTO dto) {
		log.debug("Received in TrackerToKafka: " + dto);
		dto.addTracePoint(TracePoint.builder()
				.name("KafkaProducer")
				.time(System.currentTimeMillis())
				.build());
		Message<?> message = buildAvroMessage(dto);
		output.sendTracking().send(message);
		log.debug("sent to kafka " + message);
	}
	
	private Message<?> buildAvroMessage(CarActivityDTO carActivity) {
		AvroCarActivity avroCar = AvroCarActivity.newBuilder()
				.setCarID(carActivity.getCarID())
				.setTime(carActivity.getTime())
				.setTrace(carActivity.getTrace().stream()
						.map(tp -> AvroTracePoint.newBuilder()
								.setName(tp.getName())
								.setTime(tp.getTime())
								.build())
						.collect(Collectors.toList())
				)
				.build();

		byte[] payload = null;

		try {
			payload = new AvroCodec().encode(avroCar);
		} catch (Exception ex) {}

		return MessageBuilder.withPayload(payload)
				.setHeader(MessageHeaders.CONTENT_TYPE, CONTENT_TYPE_AVRO)
				.build();

	}
}
