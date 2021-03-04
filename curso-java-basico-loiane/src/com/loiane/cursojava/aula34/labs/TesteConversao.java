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
		
		System.out.println("Deseja converter quantos metros quadrados para p�s quadrados?");
		metro = scan.nextInt();
		ConversaoDeUnidadesDeArea.converteMetroParaP�(metro);
		imprimirValor();
		
		System.out.println("Deseja converter quantos pes quadrados para centimetros quadrados?");
		pe = scan.nextInt();
		ConversaoDeUnidadesDeArea.converteP�ParaCentimetros(pe);
		imprimirValor();
		
		System.out.println("Deseja converter quantas milhas para acres?");
		milha = scan.nextInt();
		ConversaoDeUnidadesDeArea.converteMilhaParaAcre(milha);
		imprimirValor();
		
		System.out.println("Deseja converter quantos acres para p�s quadrados?");
		acre = scan.nextInt();
		ConversaoDeUnidadesDeArea.converteAcreParaP�(acre);
		imprimirValor();
		
		scan.close();
		
	}

}
