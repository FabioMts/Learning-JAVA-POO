package com.loiane.cursojava.aula43.labs.exe03;

public class Teste {

	public static void main(String[] args) {

		
		Mamifero camelo = new Mamifero();
		
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setCor("Amarelo");
		camelo.setVelocidade(2.0);
		camelo.setAlimento("Feno");
		
		
		Peixe tubarao = new Peixe();
		
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(300);
		tubarao.setVelocidade(1.5);
	
		
		Mamifero urso = new Mamifero();
		urso.setNome("Urso-do-Canadá");
		urso.setComprimento(180);
		urso.setCor("Vermelho");
		urso.setVelocidade(1.5);
		urso.setAlimento("Mel");
		
		
		Animal[] animais = new Animal[3];
		
		animais[0] = camelo;
		animais[1] = tubarao;
		animais[2] = urso;
		
		System.out.println("Zoo:");
		System.out.println("");
		System.out.println("-------------------------------------------");
		for(Animal animal : animais) {
			System.out.println(animal);
			System.out.println("-------------------------------------------");

		}
		
	}

}
