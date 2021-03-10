package com.loiane.cursojava.aula42;

public class Teste {

	public static void main(String[] args) {

		
		Pessoa pessoa = new Pessoa();
		//Pessoa aluno = new Aluno();
		//Pessoa professor = new Professor();
		
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		
		//exemplo 2
		
		System.out.println(Constantes.URL_BLOG);
		Constantes.URL_BLOG = "asduahdashu";
		System.out.println(Constantes.URL_BLOG);
		
	}

}
