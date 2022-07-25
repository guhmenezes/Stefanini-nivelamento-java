package com.stefanini.aula15;

public class Tesla extends Carro{

	private boolean carroDirigeSozinho;
	
	public Tesla() {
		super();
	}

	public boolean isCarroDirigeSozinho() {
		return carroDirigeSozinho;
	}

	public void setCarroDirigeSozinho(boolean carroDirigeSozinho) {
		this.carroDirigeSozinho = carroDirigeSozinho;
	}
	
	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("Tesla Método sobrescrito");
		return velocidadeFinal * tempoFinal;
	}
	
	
}
