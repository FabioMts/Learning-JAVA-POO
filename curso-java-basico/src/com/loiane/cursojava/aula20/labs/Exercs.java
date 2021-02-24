package com.loiane.cursojava.aula20.labs;
import java.util.Random;

public class Exercs {

	public static void main(String[] args) {

		
		int[][] M = new int[4][4];
		Random geradorAleatorio = new Random();
		
		for(int i=0; i<M.length; i++) {
			for(int j=0; j<M[i].length; j++) {
				M[i][j] = geradorAleatorio.nextInt(100);
			}
		}

		int maior =0;
		int linha =0;
		int coluna = 0;
		
		for(int i=0; i<M.length; i++) {
			for(int j=0; j<M[i].length; j++) {
				if (M[i][j] > maior) {
					maior = M[i][j];
					linha = i;
					coluna = j;
					
				}
			}
		}
		for(int i=0; i<M.length; i++) {
			for(int j=0; j<M[i].length; j++) {
				System.out.print(M[i][j] + " ");
				
				}
				System.out.println();
			}
		
		
		
		System.out.println("Maior valor: " + maior);
		System.out.println("Linha: "+ linha);
		System.out.println("Coluna: " + coluna);
		
		
	}	
}				
