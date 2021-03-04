package com.loiane.cursojava.aula34.labs;

import java.util.Scanner;

public class TesteCalculadora2 {
	
	public static void main (String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int num;
	
	do {
		System.out.println("Entre com um número positivo: ");
		num = scan.nextInt();
		
		if (num < 0) {
			System.out.println("Numero inválido, entre novamente.");
		}
		} while(num < 0);
		System.out.println(Calculadora.fatorial(num));
		
		
		scan.close();
	} 
}
