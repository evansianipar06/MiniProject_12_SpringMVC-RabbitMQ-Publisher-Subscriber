package com.miniproject.rabbitmq.Client1.controller;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.rabbitmq.Client1.model.DataRS;
import com.miniproject.rabbitmq.Client1.model.DataPasien;
//import org.springframework.amqp.core.Message;

@RestController
public class Producer {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@Autowired
	private DirectExchange exchange;
	
	@PostMapping("/tambahDataRS")
	public String send(@RequestBody DataRS message) {
		rabbitTemplate.convertAndSend(exchange.getName(),"routing.B",message);
		return "Data Tambah Rumah Sakit Sukses Terikrim !!!";
	}
	
	@PostMapping("/tambahDataPasien")
	public String sendDataPasien(@RequestBody DataPasien message) {
		rabbitTemplate.convertAndSend(exchange.getName(),"routing.A",message);
		return "Data Tambah Pasien Sukses Terikrim !!!";
	}
}
