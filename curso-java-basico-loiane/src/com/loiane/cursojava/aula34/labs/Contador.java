package com.loiane.cursojava.aula34.labs;

public class Contador {

	 private static int cont;
	 
	 
	 public Contador() {
		 cont++;
	 }
	
	public static void incrementar() {
		cont++;
	}
	
	public static void zerar() {
		cont = 0;
	}

	public static int getCont() {
		return cont;
	}	
	
}
