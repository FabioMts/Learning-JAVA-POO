package com.loiane.cursojava.aula29;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	Carro() {
		System.out.println("Classe Carro foi instanciada.");
	}
	
	Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel ) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
	
	
	void exibirAutonomia() {
		
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
		
	}
	
	double obterAutonomia() {
		
		System.out.println("Método obter autonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/consumoCombustivel;
		
		return qtdCombustivel;
		
	}
	
	
}



