package com.stefanini.aula17.entidades;

import com.stefanini.aula17.Carro;

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
