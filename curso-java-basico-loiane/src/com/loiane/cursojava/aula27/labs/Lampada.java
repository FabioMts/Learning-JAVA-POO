package com.loiane.cursojava.aula27.labs;

public class Lampada {
	
	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	boolean tipoAbajur;
	
	boolean ligada;

	void ligar() {
		ligada = true;
	}
	
	void desligar() {
		ligada = false;
	}
}
