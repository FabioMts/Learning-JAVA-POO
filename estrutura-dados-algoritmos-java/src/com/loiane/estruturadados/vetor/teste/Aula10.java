package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
		
		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato c1 = new Contato("Contato 1", "1234-567", "contato1@gmail.com");
		Contato c2 = new Contato("Contato 2", "4321-567", "contato2@gmail.com");
		Contato c3 = new Contato("Contato 3", "6987-567", "contato3@gmail.com");

		Contato c4 = new Contato("Contato 4", "6987-567", "contato4@gmail.com");

		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho = " + vetor.tamanho());
		
		int pos = vetor.busca(c4);
		if (pos > -1) {
			System.out.println("Elemento existe no vetor");
		} else {
			System.out.println("Elemento não existe no vetor");
		}
		
		System.out.println(vetor);
		
	}

}
