package com.stefanini.aula16;

public class BMW extends Carro implements Conversivel, Utilitario{
	
	public BMW() {
		System.out.println("Construindo BMW");
	}

	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("BMW Método sobrescrito");
		return velocidadeFinal / tempoFinal;
	}

	@Override
	public void piscarAlerta() {
		System.out.println("BMW chamando no pisca");
		
	}

	@Override
	public void acionarTurbo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void passear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abrirCapo() {
		// TODO Auto-generated method stub
		
	}
}
