package com.loiane.cursojava.aula46.labs;

public class Quadrado extends Figura2D{
	
	private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double CalcularArea() {
		return lado * lado;
	}
	
	

}
