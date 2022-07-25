package com.stefanini.aula04;

public class Vetor {

	public static void main(String[] args) {
		int[] notas = new int[10];
		
		notas[2] = 5;
		notas[9] = 3;
		notas[0] = 2;
//		POSIÇÕES VAZIAS ATRIBUI VALOR DEFAULT, INT = 0
		
		String[] carros = new String[] {"Chevrolet Celta", 
				"Hyundai I30", 
				"Volkswagen Jetta TSI", 
		"Ford Mustang"};
		
		System.out.println("ARRAY DE NOTAS");
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
		System.out.println("\n\nArray de Carros");
		
		
		System.out.println("Tamanho = " + carros.length);
//  FOR EACH
		for(String carro : carros) {
			System.out.print(carro + " - ");
		}
		
	}

}
