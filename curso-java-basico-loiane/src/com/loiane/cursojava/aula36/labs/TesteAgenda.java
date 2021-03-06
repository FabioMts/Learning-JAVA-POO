package com.loiane.cursojava.aula36.labs;

import java.util.Scanner;

public class TesteAgenda {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite o nome da agenda: ");
		String nome = scan.nextLine();

		Agenda agenda = new Agenda(nome);
		
		
		
		Contato[] contatos = new Contato[3];
		for(int i=0; i<3; i++) {

		System.out.println("Digite as informações do contato " + (i+1));
		Contato c = new Contato();
		
		System.out.println("Nome: ");
		nome = scan.nextLine();
		c.setNome(nome);		
		
		System.out.println("Telefone: ");
		String telefone = scan.nextLine();
		c.setTelefone(telefone);
		
		System.out.println("Email: ");
		String email = scan.nextLine();
		c.setEmail(email);
		
		contatos[i] = c;
		
		}
	
		agenda.setContatos(contatos);
		
		if(agenda != null) {
			System.out.println(agenda.obterInfo());	
		}
		
		
		scan.close();
		
	}

}
