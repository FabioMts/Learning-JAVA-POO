package com.loiane.estruturadados.vetor.labs;

import java.awt.List;

import com.loiane.estruturadados.vetor.Lista;

public class Exe01 {

	public static void main(String[] args) {

		
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		
		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("B"));
		System.out.println(lista.contem("e"));

	}

}
