package com.loiane.cursojava.aula33.labs;

import java.util.Scanner;


public class ExeJogoDaVelha {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		JogoDaVelha jogoDaVelha = new JogoDaVelha();
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhou = false;
		char sinal;
		int linha = 0;
		int coluna = 0;
		
		while (!ganhou) {
			if (jogoDaVelha.vezJogador1()){ 
				
				System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
				sinal = 'X';
			} else {
				System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
				sinal = 'O';
			}
			
			linha = valor("Linha", scan);
			coluna = valor("Coluna", scan);
			
			jogoDaVelha.validarJogada(linha, coluna, sinal);
			
			jogoDaVelha.imprimirTabuleiro();
			
			if(jogoDaVelha.verificarGanhador('X')) {
				ganhou = true;
				System.out.println("Parab�ns, jogador 1 ganhou!");
			}else if(jogoDaVelha.verificarGanhador('O')) {
				ganhou = true;
				System.out.println("Parab�ns, jogador 2 ganhou!");
			} else if(jogoDaVelha.getJogada() > 9) {
				ganhou = true;
				System.out.println("Ningu�m ganhou essa partida.");
			}
		}	
	}
	
	static int valor(String tipoValor, Scanner scan) {
		int valor = 0;
		boolean valorValida = false;
		while(!valorValida) {
			System.out.println("Entre com a " + tipoValor + "  (1, 2 ou 3)");
			valor = scan.nextInt();
			if(valor >=1 && valor <= 3) {
				valorValida = true;
			}else {
				System.out.println("Entrada inv�lida. Tente novamente.");
			}
		}
		valor--;
		return valor;
	}
}