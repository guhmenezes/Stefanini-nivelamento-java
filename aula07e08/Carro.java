package com.stefanini.aula07e08;

public class Carro {

	private String marca;
	private String modelo;
	private String chassi;
	private String placa;
	private int roda;
	private int bancos;
	private int velocidade;
	
	public Carro() {
		System.out.println("Construindo um carro...");
	}
	
	public Carro(String marca, String modelo, String placa) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
	}
	
	public String acelerar() {
		return velocidade + "km/h em 5 segundos";
	}
	
	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getRoda() {
		return roda;
	}

	public void setRoda(int roda) {
		this.roda = roda;
	}

	public int getBancos() {
		return bancos;
	}

	public void setBancos(int bancos) {
		this.bancos = bancos;
	}
	
	
}
