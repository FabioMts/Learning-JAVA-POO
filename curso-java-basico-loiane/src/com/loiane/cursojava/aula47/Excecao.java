package com.loiane.cursojava.aula47;

public class Excecao {
	
	public static void main(String[] args) {
		
		
		try {
			int[] vetor = new int[4];
			
			System.out.println("Antes da exception");
			
			vetor[4] = 1;
			
			
		} catch(ArrayIndexOutOfBoundsException expection) {
			System.out.println("Exce��o ao acessar um �ndice do vetor que n�o existe.");
			
		}
		
		System.out.println("esse texto ser� impresso ap�s a exception");

		
	}

}
