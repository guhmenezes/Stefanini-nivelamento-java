package com.stefanini.aula06;

public class Vetores {

	public static void main(String[] args) {
		int[] notas = new int[10];
		
		notas[2] = 5;
		notas[9] = 3;
		notas[0] = 2;
//		POSIÇÕES VAZIAS ATRIBUI VALOR DEFAULT, INT = 0
		
		int[][] matriz = new int[3][3] ;
		matriz[0][0] = 1;
		matriz[1][1] = 1;
		matriz[2][2] = 1;
		
		String[] meses = new String[] {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
				"Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		
		String[] carros = new String[] {"Chevrolet Celta", 
				"Hyundai I30", 
				"Volkswagen Jetta TSI", 
		"Ford Mustang"};
		
		System.out.println("MATRIZ 3X3");
		
		for(int[] i: matriz) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nARRAY DE NOTAS");
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
		System.out.println("\n\nArray de Carros");
		
		
		System.out.println("Tamanho = " + carros.length);
//  FOR EACH
		for(String carro : carros) {
			System.out.print(carro + " - ");
		}
		
		System.out.println("\n\nArray de Meses");
		
		
		System.out.println("Tamanho = " + meses.length);
//  FOR EACH
		for(String mes : meses) {
			System.out.print(mes + " ");
		}
		
		System.out.println("\n\nCalendario");
		String[][] calendario = new String[4][3];
		
		int m = 0;
		
		for(int i = 0; i < calendario.length; i++) {
			for (int j = 0; j <calendario[i].length; j++) {	
				calendario[i][j] = meses[m].substring(0, 3);
				System.out.print(calendario[i][j] + "\t");
				m++;
			}
			System.out.println();
		}
		
	}

}
