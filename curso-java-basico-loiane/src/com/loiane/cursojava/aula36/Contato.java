package com.loiane.cursojava.aula36;

public class Contato {
	
	private String nome;
	private Endereco endere�o;
	private Telefone[] telefones;
	
	public Contato() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public Endereco getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(Endereco endere�o) {
		this.endere�o = endere�o;
	}

	public Telefone[] getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

	
	
	

}
