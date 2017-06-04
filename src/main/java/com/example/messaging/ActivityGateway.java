package com.example.messaging;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface ActivityGateway {

	String TOPIC = "activity_event_bus";
	
	@Output(TOPIC)
	MessageChannel publish();
}
