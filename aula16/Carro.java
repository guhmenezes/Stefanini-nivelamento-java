package com.stefanini.aula16;

public abstract class Carro {

	private String marca;
	private String modelo;
	private int velocidadeMax;
	private int taxaAceleracao;
	private double kmPorLitro;
	
	public Carro() {
		System.out.println("Construindo carro");
	}
	
	public Carro(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		System.out.println("Construindo carro "+ marca + " " + modelo);
	}
	
	public void acelerar() {
		System.out.println("Acelerando...");
	}
	
	public void frear() {
		System.out.println("Freando...");
	}
	
	public abstract void piscarAlerta();
	
	public double calcularTaxaAceleracao(double velocidadeFinal, double velocidadeInicial, double tempoFinal, double tempoInicial) {
		return (velocidadeFinal - velocidadeInicial) / (tempoFinal - tempoInicial) *3.6;
	}

	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		return (velocidadeFinal - 0) / (tempoFinal - 0) *3.6;
	}
	
	public String calcularTaxaAceleracao(int velocidadeFinal, int tempoFinal) {
		return "" + (velocidadeFinal - 0) / (tempoFinal - 0) *3.6;
	}

	public String getMarca() {
		return marca;
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

	public int getVelocidadeMax() {
		return velocidadeMax;
	}

	public void setVelocidadeMax(int velocidadeMax) {
		if(velocidadeMax < 0) {
			System.out.println("Velocidade Inválida");
		} else {
			this.velocidadeMax = velocidadeMax;
		}
	}

	public int getTaxaAceleracao() {
		return taxaAceleracao;
	}

	public void setTaxaAceleracao(int taxaAceleracao) {
		this.taxaAceleracao = taxaAceleracao;
	}

	public double getKmPorLitro() {
		return kmPorLitro;
	}

	public void setKmPorLitro(double kmPorLitro) {
		this.kmPorLitro = kmPorLitro;
	}
	
	
}
