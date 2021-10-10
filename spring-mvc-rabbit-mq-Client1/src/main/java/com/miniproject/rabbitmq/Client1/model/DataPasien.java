package com.miniproject.rabbitmq.Client1.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DataPasien {
	
	public int id;
	public String nama;
	public int usia;
	public String alamat;
	public String penyakit;
}
