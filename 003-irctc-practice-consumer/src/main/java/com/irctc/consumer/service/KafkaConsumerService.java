package com.irctc.consumer.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
	
	@KafkaListener(topics = "irctc-test",groupId = "CG1")
	public void consumeMessage(ConsumerRecord<String, String>record) {
		
		System.out.println("Kafka consumer :::::::::::::::::::::::::;START");
		String message = record.value();
		System.out.println("Kafka consumer :::::::::::::::::::::::::;received: " + message);
	}
}
