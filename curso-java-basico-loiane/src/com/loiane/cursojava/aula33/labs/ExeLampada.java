package com.loiane.cursojava.aula33.labs;

public class ExeLampada {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();
		
		lampada.setCor("Azul");
		lampada.getCor();
		lampada.setGarantiaMeses(12);
		lampada.getGarantiaMeses();
		
		System.out.println("A cor e a garantia da lampada respectivamente, são: " + lampada.getCor() + " e " + lampada.getGarantiaMeses());
		
		
	}

}
