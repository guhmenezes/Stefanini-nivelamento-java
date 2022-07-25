package com.stefanini.aula05;

public class OperadoresAtribuicao {

	public static void main(String[] args) {
		int a = 10; // Atribuição
		int b = 5;
		
		int aditivo = a += b; 
		int subtrativo = a -= b;
		int multiplicativo = a *= b;
		int divisivo = a /= b;
		int modular = a %= b;
		
		String msg = String.format("Resultados: %d, %d, %d, %d, %d", aditivo, subtrativo, multiplicativo, divisivo, modular);
		
		System.out.println(msg);
		

	}

}
