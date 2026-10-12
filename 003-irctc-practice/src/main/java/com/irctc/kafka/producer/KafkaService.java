package com.irctc.kafka.producer;


import org.apache.kafka.clients.producer.ProducerRecord; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	public void publishMessage(String topic,String message)
	{
		
		System.out.println("kafka.publishMessage()::::::::::::::::::::::::::::::START");
		
		ProducerRecord<String, String> producerRecord = new ProducerRecord<String, String>(topic, null, message);
		
		kafkaTemplate.send(producerRecord);
		
		System.out.println("kafka.publishMessage()::::::::::::::::::::::::::::::END");
	}
}
