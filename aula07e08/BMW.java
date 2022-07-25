package com.stefanini.aula07e08;

public class BMW extends Carro{
	
	public BMW() {
		this.setMarca("BMW");
	}
	
	@Override
	public String acelerar() {
		return "A BMW pode fazer de 0 a " + this.getVelocidade() +"km/h em 5 segundos"; 
	}
	
}
