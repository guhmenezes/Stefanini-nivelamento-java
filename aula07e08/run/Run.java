package com.stefanini.aula07e08.run;

import com.stefanini.aula07e08.BMW;
import com.stefanini.aula07e08.Carro;
import com.stefanini.aula07e08.Mercedes;

public class Run {

	public static void main(String[] args) {
		Carro carro01 = new Carro();
		carro01.setMarca("BMW");
		carro01.setModelo("320i");
		carro01.setChassi("HSDGFHSJ823SHD");
		carro01.setPlaca("BMW9J65");
		carro01.setRoda(20);
		carro01.setBancos(5);
		carro01.setVelocidade(280);
		
		System.out.println(carro01.getMarca());
		System.out.println(carro01.getModelo());
		System.out.println(carro01.getChassi());
		System.out.println(carro01.getPlaca());
		System.out.println(carro01.getRoda());
		System.out.println(carro01.getBancos());
		System.out.println(carro01.acelerar());
		
		Carro carro02 = new Carro("Mercedes", "A45 AMG", "AMG9999");
		System.out.println(carro02.getMarca());
		
		System.out.println(soma(5,10));
		System.out.println(soma(10,10,10));
		
		BMW bmw = new BMW();
		bmw.setVelocidade(100);
		System.out.println(bmw.acelerar());
		
		Mercedes mercedes = new Mercedes();
		System.out.println(mercedes.acelerar());
		

	}

	public static int soma(int a,int b) {
		return a+b;
	}
	
	public static int soma(int a, int b, int c) {
		return a+b+c;
	}
}
