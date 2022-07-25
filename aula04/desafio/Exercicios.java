package com.stefanini.aula04.desafio;

public class Exercicios {

	public static void main(String[] args) {
		
		int[][] aleatorio = new int[4][4];
		
		for(int i = 0; i < aleatorio.length; i++) {
			for(int j = 0; j < aleatorio[i].length; j++) {
				int random = (int) Math.floor(Math.random() * 10);
				aleatorio[i][j] = random;
			}
		}
		
		int maior = 0;
		int linha = 0;
		int coluna = 0;
		
		for(int i = 0; i < aleatorio.length; i++) {
			for(int j = 0; j < aleatorio[i].length; j++) {
				if(aleatorio[i][j] > maior) {
					maior = aleatorio[i][j];
					linha = i;
					coluna = j;
				}
				
			}
		}
		
		for(int i = 0; i < aleatorio.length; i++) {
			for(int j = 0; j < aleatorio[i].length; j++) {
				System.out.print(aleatorio[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Maior valor é o " + maior + " que está na linha " + linha + " e coluna " + coluna);

	}

}
