package com.stefanini.aula12;

public class IfElse {

	public static void main(String[] args) {
		int idade = 18;
		
		if (idade >= 18) {
			System.out.println("Maior de idade.");
		}
		
		if (idade >= 18) {
			System.out.println("Maior de idade.");
		} else {
			System.out.println("Menor de idade.");
		}
		
		if (idade >= 100) {
			System.out.println("Virou uma múmia");
		} else if (idade >= 18) {
			System.out.println("Maior de idade.");
		} else {
			System.out.println("Menor de idade.");
		}

	}

}
