package com.miniproject.rabbitmq.JavarabbitmqClient2;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Conf {
	
	public static final String ROUTING_A = "routing.A";
	public static final String ROUTING_B = "routing.B";

	@Bean
	Queue queueA() {
		return new Queue("queue.A",false); //nama Queue
	}
	
	@Bean
	Queue queueB() {
		return new Queue("queue.B",false); //nama Queue
	}
	
	@Bean
	DirectExchange exchange() {
		return new DirectExchange("exchange.direct"); //tipe exchange
	}
	
	@Bean
	Binding binding(Queue queueA,DirectExchange exchange) {
		return BindingBuilder.bind(queueA)
				.to(exchange)
				.with(ROUTING_A); //routing Key
	}
	
	@Bean
	Binding bindingB(Queue queueB,DirectExchange exchange) {
		return BindingBuilder.bind(queueB)
				.to(exchange)
				.with(ROUTING_B); //routing Key
	}
	
	@Bean
	MessageConverter messageConverter() {
		return new Jackson2JsonMessageConverter();
	}
	
	@Bean
	RabbitTemplate rabbitTemplate(ConnectionFactory factory) {
		RabbitTemplate rabbitTemplate = new RabbitTemplate(factory);
		rabbitTemplate.setMessageConverter(messageConverter());
		return rabbitTemplate;
	}
}

