package com.loiane.cursojava.aula20.labs;
import java.util.Scanner;

public class Exercs {

	public static void main(String[] args) {

		
//		int[][] M = new int[4][4];
//		Random geradorAleatorio = new Random();
//		
//		for(int i=0; i<M.length; i++) {
//			for(int j=0; j<M[i].length; j++) {
//				M[i][j] = geradorAleatorio.nextInt(10);
//			
//			}
//		}
//		
//		
//		int maior =0;
//		int linha =0;
//		int coluna = 0;
//		
//		for(int i=0; i<M.length; i++) {
//			for(int j=0; j<M[i].length; j++) {
//				if (M[i][j] > maior) {
//					maior = M[i][j];
//					linha = i;
//					coluna = j;
//					
//				}
//			}
//		}
//		for(int i=0; i<M.length; i++) {
//			for(int j=0; j<M[i].length; j++) {
//				System.out.print(M[i][j] + " ");
//				
//				}
//				System.out.println();
//			}
//		
//		
//		
//		System.out.println("Maior valor: " + maior);
//		System.out.println("Linha: "+ linha);
//		System.out.println("Coluna: " + coluna);
		
		
		
		
		
		
		//exercicio 2
		
//		int[][] M = new int[10][10];
//		Random geradorAleatorio = new Random();
//		
//		for(int i=0; i<M.length; i++) {
//			for(int j=0; j<M[i].length; j++) {
//				M[i][j] = geradorAleatorio.nextInt(100);
//			}
//		}
//		
//		for(int i=0; i<M.length; i++) {
//			for(int j=0; j<M[i].length; j++) {
//				System.out.print(M[i][j] + " ");
//				
//				}
//				System.out.println();
//			}
//		
//		int maiorl5 = 0;
//		int menorl5 =101;
//		int linha5 = 5;
//		
//		for(int i=0; i<M[linha5].length;i++) {
//			if(M[linha5][i] > maiorl5) {
//				maiorl5 = M[linha5][i];
//			}
//			if(M[linha5][i] < menorl5 ) {
//				menorl5 = M[linha5][i];
//			}
//		}
//		
//		System.out.println("Maior valor da linha 5 = " + maiorl5);
//		System.out.println("Menor valor da linha 5 = " + menorl5);
//
//		
//		int maiorC7 = 0;
//		int menorC7 = 101;
//		int coluna7 = 0;
//		
//		for(int i=0; i<M.length; i++) {
//			if(M[i][coluna7] > maiorC7) {
//			maiorC7 = M[i][coluna7];
//			}
//			if(M[i][coluna7] < menorC7) {
//				menorC7 = M[i][coluna7];
//			}	
//		}
//		
//		System.out.println("Maior valor da coluna 7 = " + maiorC7);
//		System.out.println("Menor valor da coluna 7 = " + menorC7);


		
		
	
		
		
		
		
		//exerc 3
		
//		Scanner scan = new Scanner(System.in);
//		
//		int[][] matriz = new int[3][3];
//		
//		for(int i=0; i<matriz.length; i++) {
//			for(int j=0; j<matriz[i].length;j++) {
//				System.out.println("Entre com o valor da linha " + i + " e da coluna " + j + " da matriz.");
//				matriz[i][j] = scan.nextInt();
//		}
//		
//			}
//	
//		for(int i=0; i<matriz.length; i++) {
//			for(int j=0; j<matriz[i].length; j++) {
//				System.out.print(matriz[i][j] + " ");
//				
//				}
//				System.out.println();
//			}
//		int qtdPares= 0;
//		int qtdImpares=0;
//		for(int i=0; i<matriz.length; i++) {
//			for(int j=0; j<matriz[i].length; j++) {
//				if(matriz[i][j] % 2 == 0) {
//					qtdPares +=1;
//				}
//				if(matriz[i][j] % 2 != 0) {
//					qtdImpares +=1;
//				}
//			}
//		}
//		
//		System.out.println("A quantidade de numeros pares é: " + qtdPares);
//		System.out.println("A quantidade de numeros impares é: " + qtdImpares);
//		
		
		
		
		
		
		
		
		//ex 4
		
		String[][] matrizCompromisso = new String[31][24];
		Scanner scan = new Scanner(System.in);
		
		
		boolean sair = false;
		byte opcao;
		while(!sair) {
			
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			
			opcao = scan.nextByte();
			
			if(opcao == 1) { // adicionar compromisso
				
				boolean diaValido = false;
				int dia = 0;
				while(!diaValido) {
					System.out.println("Entre com o dia do mês: ");
					dia = scan.nextInt();
					if(dia > 0 || dia <= 31) {
						diaValido = true;
					}else {
						System.out.println("Dia digitado inválido, digite novamente.");
					}
				}
				
				boolean horaValida = false;
				int hora =0;
				while(!horaValida) {
					System.out.println("Entre com a hora do compromisso: ");
					hora = scan.nextInt();
					if(hora >= 0 || hora <= 24) {
						horaValida = true;
					}else {
						System.out.println("Hora digitado inválida, digite novamente.");
					}
				}
				
				dia--;
				System.out.println("Digite o compromisso: ");
				matrizCompromisso[dia][hora] = scan.next();
				
				
				
			} else if(opcao == 2) { // verificar compromisso
				
				boolean diaValido = false;
				int dia = 0;
				while(!diaValido) {
					System.out.println("Entre com o dia do mês: ");
					dia = scan.nextInt();
					if(dia > 0 || dia <= 31) {
						diaValido = true;
					}else {
						System.out.println("Dia digitado inválido, digite novamente.");
					}
				}
				
				boolean horaValida = false;
				int hora =0;
				while(!horaValida) {
					System.out.println("Entre com a hora do compromisso: ");
					hora = scan.nextInt();
					if(hora >= 0 || hora <= 24) {
						horaValida = true;
					}else {
						System.out.println("Hora digitado inválida, digite novamente.");
					}
				}
				dia--;
				System.out.println("O compromisso agendado é: ");
				System.out.println(matrizCompromisso[dia][hora]);
				
			}else if (opcao == 0) {
				sair = true;
			}else {
				System.out.println("Opção inválida, digite novamente.");
			}
			
		}
		
		
		
		
		
		
	}	
}				
