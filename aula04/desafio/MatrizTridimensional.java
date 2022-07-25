package com.stefanini.aula04.desafio;

public class MatrizTridimensional {

	public static void main(String[] args) {
		
		int[][][] tridimensional = new int [3][3][3];
		
		for(int i = 0; i < tridimensional.length; i++) {
			for(int j = 0; j < tridimensional[i].length; j++) {
				for(int k = 0; k < tridimensional[i][j].length; k++) {
					System.out.println("i = " + i + " - j = " + j + " - k = " + k);
					tridimensional[i][j][k] = i + j + k;
				}
			}
		}
		
		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;
		
		for(int i = 0; i < tridimensional.length; i++) {
			for(int j = 0; j < tridimensional[i].length; j++) {
				for(int k = 0; k < tridimensional[i][j].length; k++) {
					soma += tridimensional[i][j][k];
					
					if(tridimensional[i][j][k] % 2 == 0)
						somaPares += tridimensional[i][j][k];
					else
						somaImpares += tridimensional[i][j][k];
				}
			}
		}
		
		System.out.println("Soma Total = " + soma);
		System.out.println("Soma Total = " + somaPares);
		System.out.println("Soma Total = " + somaImpares);
	}
	
}
