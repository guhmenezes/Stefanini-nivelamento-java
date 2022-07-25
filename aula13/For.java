package com.stefanini.aula13;

public class For {

	public static void main(String[] args) {
		
//		for normal
		for(int i = 0; i < 20; i++) {
			System.out.println(i);
		}
		
		for(int i = 0, j = 10; i < 10; i++,j--) {
			System.out.println("i = " + i);
			System.out.println("j = " + j);
		}

//		for com apenas uma condição
		int i = 3;
		
		for(;i < 10;) {
			System.out.println(i);
			i++;
		}
		
//		for loop infinito
		for(;;) {
			System.out.println("Ao infinito e além");
		}
	}

}
