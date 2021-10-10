package com.miniproject.rabbitmq.JavarabbitmqClient2;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Consumer {
	
	private static final Logger log = LoggerFactory.getLogger(Consumer.class);
	
	
	@RabbitListener(queues = "queue.A")
	private void receive(DataRS message) {
		log.info("Message telah diterima dari Queue-A : {}",message);
	}
	
	@RabbitListener(queues = "queue.B")
	private void receiveFromB(DataPasien message) {
		log.info("Message telah diterima dari Queue-B : {}",message);
	}
}
