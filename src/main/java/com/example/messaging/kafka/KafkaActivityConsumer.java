package com.example.messaging.kafka;

import com.example.domain.avro.AvroCarActivity;
import com.example.domain.TracePoint;
import com.example.messaging.ActivityGateway;
import com.example.util.AvroCodec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

import com.example.domain.CarActivityDTO;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.stream.Collectors;

@Component
//@EnableBinding(ActivityGateway.class)
public class KafkaActivityConsumer {

	private static final Logger log = LoggerFactory.getLogger(KafkaActivityConsumer.class);
	
	private final ObjectMapper mapper;
    private final SimpMessageSendingOperations clientPushTemplate;

    public KafkaActivityConsumer(ObjectMapper mapper, SimpMessageSendingOperations messagingTemplate) {
        this.mapper = mapper;
        this.clientPushTemplate = messagingTemplate;
    }

    @StreamListener(ActivityGateway.TOPIC)
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
                .name(this.getClass().getSimpleName())
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
		clientPushTemplate.convertAndSend("/car/tracker", json);
	}
}
