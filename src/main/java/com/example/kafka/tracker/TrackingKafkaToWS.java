package com.example.kafka.tracker;

import javax.inject.Inject;

import com.example.domain.tracker.TracePoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Component;

import com.example.domain.tracker.CarActivityDTO;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@EnableBinding({ActivitySink.class})
public class TrackingKafkaToWS {

	private static final Logger log = LoggerFactory.getLogger(TrackingKafkaToWS.class);
	
	@Autowired
	ObjectMapper mapper;
	
    @Inject
    SimpMessageSendingOperations messagingTemplate;
	
    @StreamListener(ActivitySource.TOPIC)
	public void loggerSink(CarActivityDTO dto) {
		log.debug("Received from Kafka: " + dto);
		dto.addTracePoint(TracePoint.builder()
				.name("KafkaConsumer")
				.time(System.currentTimeMillis())
				.build());
		sendToClients(dto);
	}

	public void sendToClients(CarActivityDTO dto) {
		String json = "";
		try {
			json = mapper.writeValueAsString(dto);
		} catch (Exception ex) {ex.printStackTrace();}
		log.debug("Sending to clients: " + json);
		messagingTemplate.convertAndSend("/car/tracker", json);
	}
}
