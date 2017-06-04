package com.example.messaging.kafka;

import com.example.domain.avro.AvroCarActivity;
import com.example.domain.avro.AvroTracePoint;
import com.example.domain.TracePoint;
import com.example.messaging.ActivityGateway;
import com.example.util.AvroCodec;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;

import com.example.domain.CarActivityDTO;

import java.util.stream.Collectors;

@Slf4j
@Component
@EnableBinding(ActivityGateway.class)
public class KafkaActivityProducer {
	
	private static final String CONTENT_TYPE_AVRO = "binary/avro";

	private final ActivityGateway gateway;

	public KafkaActivityProducer(ActivityGateway output) {
		this.gateway = output;
	}

	public void send(CarActivityDTO dto) {
		log.debug("Received in KafkaActivityProducer: " + dto);
		dto.addTracePoint(TracePoint.builder()
				.name(this.getClass().getSimpleName())
				.time(System.currentTimeMillis())
				.build());
		Message<?> message = buildAvroMessage(dto);
		gateway.publish().send(message);
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
