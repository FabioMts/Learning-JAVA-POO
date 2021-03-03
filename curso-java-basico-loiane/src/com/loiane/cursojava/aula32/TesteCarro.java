package com.loiane.cursojava.aula32;

public class TesteCarro {

	public static void main(String[] args) {

		
		Carro van = new Carro();

		van.setMarca("Fiat");
		System.out.println(van.getMarca());
		
		
		van.setConsumoCombustivel(0.2);
		System.out.println(van.getConsumoCombustivel());
	}

}
