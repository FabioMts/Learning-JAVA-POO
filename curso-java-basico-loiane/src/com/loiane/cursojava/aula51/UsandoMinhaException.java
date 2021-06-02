package com.loiane.cursojava.aula51;

public class UsandoMinhaException {

	public static void main(String[] args) {
		
		int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
		int[] demon = {2, 0, 4, 8, 0, 2, 3};

		for(int i=0; i<numeros.length; i++) {

			try {
				System.out.println(numeros[i] + "/" + demon[i] + " = " +  (numeros[i]/demon[i]));
			}
			catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Aconteceu um erro");
			}
			
		}
	}

}
