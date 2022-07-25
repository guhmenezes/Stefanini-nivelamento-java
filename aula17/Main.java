package com.stefanini.aula17;

import com.stefanini.aula17.entidades.*;

public class Main {

	static int valor;
	
	static void print() {
		System.out.println(valor);
	}
	
	public static void main(String[] args) {
		valor = 10;
		print();
		Carro bmw = new Carro();
		Carro mercedes = new Carro("Mercedes", "C100");
		BMW bmw02 = new BMW();
		Tesla tesla = new Tesla();
		Carro tesla02 = new Tesla();
		
		tesla.setCarroDirigeSozinho(true);
		System.out.println("Tesla dirige sozinho? " + tesla.isCarroDirigeSozinho());
		((Tesla) tesla02).setCarroDirigeSozinho(true); // Casting
		
		Carro[] carros = new Carro[] {bmw, mercedes, bmw02, tesla, tesla02};
		
		for(Carro carro: carros) {
			if(Constantes.MARCA_FAMOSA.equals(carro.getMarca())) {
				System.out.println("Carro de marca famosa");
			} 
			if(carro instanceof Tesla) {
				System.out.println(((Tesla)carro).isCarroDirigeSozinho());
			}
		}
		
//		Calcular.soma(0,0); SÓ FUNCIONA SE O MÉTODO FOR STATIC, SE NÃO PRECISA INSTANCIAR
		
//		Constantes.MARCA_FAMOSA = "Porsche"; CONSTANTE
		
		System.out.println(bmw02.calcularTaxaAceleracao(100.5, 10));
		System.out.println(tesla.calcularTaxaAceleracao(100.5, 10));
		
		
		System.out.println(bmw02.calcularTaxaAceleracao(100.5, 10.5));
		
		bmw.setMarca("BMW");
		bmw.setModelo("M3");
		bmw.setKmPorLitro(7.5);
		bmw.setTaxaAceleracao(50);
		bmw.setVelocidadeMax(280);
		
		System.out.println(bmw.getMarca());
		bmw.acelerar();
		bmw.frear();
		System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMax(), 0, 10, 0));
		System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMax(), 5));
		System.out.println(mercedes.calcularTaxaAceleracao(100, 5));

	}

}
