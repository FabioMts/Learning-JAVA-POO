package com.loiane.cursojava.aula34.labs;

public class ConversaoDeUnidadesDeArea {
	
	
	static double metro;
	static double p�;
	static double milhaQuadrada;
	static double acre;
	static double conversao;

	
	
	
	
	public static double getConversao() {
		return conversao;
	}


	public static double converteMetroParaP�(double metro) {
		
		 conversao = metro * 10.76; 
		return conversao;
	}
	
	public static double converteP�ParaCentimetros(double pe) {
		 conversao = pe * 929;
		return conversao;
	}
	
	public static double converteMilhaParaAcre(double milha) {
		conversao = milha * 640;
		return conversao;
	}
	
	public static double converteAcreParaP�(double acre) {
		conversao = acre * 43.560;
		return conversao;
	}
	
	
	
}
