package com.loiane.cursojava.aula43.labs.exe03;

public class Mamifero extends Animal{
	
	public String alimento;

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	

	public Mamifero() {
		super();
		this.setAmbiente("terra");
		
	}
	
	
	@Override
	public String toString() {
		String s = super.toString();
		s += "\nAlimento: " + alimento;
		return s;
	}
	
}
