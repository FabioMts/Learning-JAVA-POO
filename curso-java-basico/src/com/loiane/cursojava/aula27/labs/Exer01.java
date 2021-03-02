package com.loiane.cursojava.aula27.labs;

public class Exer01 {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();
		
		lampada.ligada = true;
	
		
		lampada.ligar();
		System.out.println("A lampada está: " + lampada.ligada);
		
		
		lampada.desligar();
		System.out.println("A lampada está " + lampada.ligada);
	}
	

}
