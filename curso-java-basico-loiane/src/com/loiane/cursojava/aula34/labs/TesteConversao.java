package com.loiane.cursojava.aula34.labs;

import java.util.Scanner;

public class TesteConversao {
	
	static void imprimirValor() {
		System.out.println(ConversaoDeUnidadesDeArea.getConversao());
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double metro;
		double pe;
		double milha;
		double acre;
		
		System.out.println("Deseja converter quantos metros quadrados para pés quadrados?");
		metro = scan.nextInt();
		ConversaoDeUnidadesDeArea.converteMetroParaPé(metro);
		imprimirValor();
		
		System.out.println("Deseja converter quantos pes quadrados para centimetros quadrados?");
		pe = scan.nextInt();
		ConversaoDeUnidadesDeArea.convertePéParaCentimetros(pe);
		imprimirValor();
		
		System.out.println("Deseja converter quantas milhas para acres?");
		milha = scan.nextInt();
		ConversaoDeUnidadesDeArea.converteMilhaParaAcre(milha);
		imprimirValor();
		
		System.out.println("Deseja converter quantos acres para pés quadrados?");
		acre = scan.nextInt();
		ConversaoDeUnidadesDeArea.converteAcreParaPé(acre);
		imprimirValor();
		
		scan.close();
		
	}

}
