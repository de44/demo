package com.example.kafka.tracker;

import javax.inject.Inject;

import com.example.domain.AvroCar;
import com.example.domain.tracker.AvroCarActivity;
import com.example.domain.tracker.TracePoint;
import com.example.util.AvroCodec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

import com.example.domain.tracker.CarActivityDTO;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.stream.Collectors;

@Component
@EnableBinding({ActivitySink.class})
public class TrackingKafkaToWS {

	private static final Logger log = LoggerFactory.getLogger(TrackingKafkaToWS.class);
	
	@Autowired
	ObjectMapper mapper;
	
    @Inject
    SimpMessageSendingOperations messagingTemplate;
	
    @StreamListener(ActivitySink.TOPIC)
	public void loggerSink(GenericMessage<byte[]> message) {
        log.debug("Received Generic messsage: " + message);

        byte[] payload = message.getPayload();

        AvroCodec codec = new AvroCodec();
        AvroCarActivity payloadCar = null;
        try {
            payloadCar = codec.decode(payload, AvroCarActivity.class);
        }catch (Exception ex) {
            ex.printStackTrace();
        }

        CarActivityDTO carActivity = CarActivityDTO.builder()
                .carID(payloadCar.getCarID().toString())
                .time(payloadCar.getTime().toString())
                .trace(payloadCar.getTrace().stream()
                        .map(atp -> TracePoint.builder()
                                .name(atp.getName().toString())
                                .time(atp.getTime())
                                .build())
                        .collect(Collectors.toList())
                )
                .build();

        carActivity.addTracePoint(TracePoint.builder()
                .name("KafkaConsumer")
                .time(System.currentTimeMillis())
                .build());

		sendToClients(carActivity);
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
