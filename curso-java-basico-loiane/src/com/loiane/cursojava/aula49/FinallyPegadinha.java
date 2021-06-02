package com.loiane.cursojava.aula49;

public class FinallyPegadinha {

	public static void main(String[] args) {
		
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] demon = {2, 0, 4, 8, 0};
		
		for(int i=0; i<numeros.length; i++) {
			
			try {
			System.out.println(numeros[i] + "/" + demon[i] + " = " +  (numeros[i]/demon[i]));
			}
			catch(ArithmeticException e1) {
				System.out.println("Erro ao dividir por 0.");
				System.exit(0);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Posi��o do Array inv�lida.");
				System.exit(0);
			}
			finally {
				System.out.println("Essa linha � impressa sempre ap�s o try ou o catch");
				System.out.println("");
			}
		}

	}

}
