package com.loiane.cursojava.aula34.labs;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		imprimirTela(Calculadora.soma(1, 2));
		
		imprimirTela(Calculadora.subtrair(2, 1));
		imprimirTela(Calculadora.multiplicar(2, 2));
		imprimirTela(Calculadora.dividir(4, 2));
		imprimirTela(Calculadora.potencia(2, 4));
		
	}
	
	static void imprimirTela(int num) {
		System.out.println(num);
	}
	

}
