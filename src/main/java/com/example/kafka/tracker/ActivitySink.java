package com.example.kafka.tracker;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

@Component
public interface ActivitySink {

	String TOPIC = "activitySource";
	
	@Input(ActivitySink.TOPIC)
	SubscribableChannel recieveTracking();
	
	
}
