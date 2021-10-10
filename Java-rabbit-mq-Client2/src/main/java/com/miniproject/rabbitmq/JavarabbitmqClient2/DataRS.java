package com.miniproject.rabbitmq.JavarabbitmqClient2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DataRS {
	
	private int id;
	private String kodeRS;	
	private String namaRS;
	private String alamat;
	private String kecamatan;
	private String kab_kota;
	private String provinsi;
	private String telepon;
	private String email;
	private String kelasRS;
	private String statusPenggunaan;
	private String pemilik_pengelola;
	private int jlh;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKodeRS() {
		return kodeRS;
	}
	public void setKodeRS(String kodeRS) {
		this.kodeRS = kodeRS;
	}
	public String getNamaRS() {
		return namaRS;
	}
	public void setNamaRS(String namaRS) {
		this.namaRS = namaRS;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getKecamatan() {
		return kecamatan;
	}
	public void setKecamatan(String kecamatan) {
		this.kecamatan = kecamatan;
	}
	public String getKab_kota() {
		return kab_kota;
	}
	public void setKab_kota(String kab_kota) {
		this.kab_kota = kab_kota;
	}
	public String getProvinsi() {
		return provinsi;
	}
	public void setProvinsi(String provinsi) {
		this.provinsi = provinsi;
	}
	public String getTelepon() {
		return telepon;
	}
	public void setTelepon(String telepon) {
		this.telepon = telepon;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getKelasRS() {
		return kelasRS;
	}
	public void setKelasRS(String kelasRS) {
		this.kelasRS = kelasRS;
	}
	public String getStatusPenggunaan() {
		return statusPenggunaan;
	}
	public void setStatusPenggunaan(String statusPenggunaan) {
		this.statusPenggunaan = statusPenggunaan;
	}
	public String getPemilik_pengelola() {
		return pemilik_pengelola;
	}
	public void setPemilik_pengelola(String pemilik_pengelola) {
		this.pemilik_pengelola = pemilik_pengelola;
	}
	public int getJlh() {
		return jlh;
	}
	public void setJlh(int jlh) {
		this.jlh = jlh;
	}
	
	
}

