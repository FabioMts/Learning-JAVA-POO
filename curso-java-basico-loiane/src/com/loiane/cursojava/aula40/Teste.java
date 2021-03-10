package com.loiane.cursojava.aula40;

public class Teste {
	
	public static void main (String []args) {
		
		Aluno aluno1 = new Aluno();
		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		pessoa.setEndereco("Rua 01, número 1");
		aluno.setEndereco("Rua 02, número 2");
		professor.setEndereco("Rua 03, número 3");
		
		
		System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());

		
		
		
		
	}
	

}
