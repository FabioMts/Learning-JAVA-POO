package com.loiane.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {

		int[] notas = new int[10];
		
		Random random = new Random();
		
		for(int i=0; i<notas.length; i++) {
			notas[i] = random.nextInt(10);
		}
		
		for(int i=0; i<notas.length; i++) {

			System.out.println(notas[i]);
			
		}
		
		
		//USANDO FOR EACH
		
		System.out.println("Usando FOR EACH: ");
		
		for(int nota : notas) {
			System.out.println(nota);
		}
		
	}
}
