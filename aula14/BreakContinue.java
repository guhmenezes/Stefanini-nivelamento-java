package com.stefanini.aula14;

public class BreakContinue {

	public static void main(String[] args) {
		String[] carros = new String[] {"Chevrolet Celta", 
				"Hyundai I30", 
				"Volkswagen Jetta TSI", 
		"Ford Mustang"};
		
		for(int i = 0; i < carros.length; i++) {
			if(carros[i].contains("TSI")) {
				System.out.println(carros[i]);
//				break; PARA O LOOP
				continue; // PARA AQUI E INICIA O PROXIMO LOOP
			}
			
			System.out.println(carros[i] + " SEM CONTINUE");
		}

	}

}
