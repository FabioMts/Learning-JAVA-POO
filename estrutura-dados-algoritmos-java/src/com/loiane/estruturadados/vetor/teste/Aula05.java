package com.loiane.estruturadados.vetor.teste;
import com.loiane.estruturadados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(10);

		vetor.adiciona("Elemento 1"); //0
		vetor.adiciona("Elemento 2"); //01
		vetor.adiciona("Elemento 3"); //02

		
		System.out.println(vetor.busca(0));
		
	}

}

