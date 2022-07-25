package com.stefanini.aula09a11;

public class BMW extends Carro{
	
	public BMW() {
		System.out.println("Construindo BMW");
	}

	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("BMW Método sobrescrito");
		return velocidadeFinal / tempoFinal;
	}
}
