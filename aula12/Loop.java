package com.stefanini.aula12;

public class Loop {

	public static void main(String[] args) {
//		while
		int count = 101;
		
		while (count < 100) {
			System.out.println("Count: " + count);
			count++;
		}
		
//		do while
		int countDois = 101;
		
		do {
			System.out.println("Count02: " + countDois);
			countDois++;
		} while(countDois < 100);
		
//		for normal
		for(int i = 0; i < 100; i++) {
			System.out.println(i);
		}

//		for com areas ausentes
		int i = 0;
		for(; i < 100;) {
			System.out.println(i);
			i++;
		}
		
//		for com todas as areas ausentes INFINITO
		for(;;) {
			System.out.println("f");
		}
	}

}
