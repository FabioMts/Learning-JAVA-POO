package com.loiane.cursojava.aula34.labs;

public class TesteContador {

	static void imprimirValor() {
		System.out.println(Contador.getCont());
	}
	
	public static void main(String[] args) {

		imprimirValor();
		
		Contador.incrementar();
		
		imprimirValor();
		
		Contador.zerar();
		
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();

		imprimirValor();
		
		
		Contador c1 = new Contador();
		Contador c2 = new Contador();
		Contador c3 = new Contador();
		
		imprimirValor();
	}

}
