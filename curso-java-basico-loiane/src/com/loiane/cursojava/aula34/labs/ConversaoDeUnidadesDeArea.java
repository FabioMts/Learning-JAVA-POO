package com.loiane.cursojava.aula34.labs;

public class ConversaoDeUnidadesDeArea {
	
	
	static double metro;
	static double pé;
	static double milhaQuadrada;
	static double acre;
	static double conversao;

	
	
	
	
	public static double getConversao() {
		return conversao;
	}


	public static double converteMetroParaPé(double metro) {
		
		 conversao = metro * 10.76; 
		return conversao;
	}
	
	public static double convertePéParaCentimetros(double pe) {
		 conversao = pe * 929;
		return conversao;
	}
	
	public static double converteMilhaParaAcre(double milha) {
		conversao = milha * 640;
		return conversao;
	}
	
	public static double converteAcreParaPé(double acre) {
		conversao = acre * 43.560;
		return conversao;
	}
	
	
	
}
