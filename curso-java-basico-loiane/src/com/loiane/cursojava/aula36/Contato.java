package com.loiane.cursojava.aula36;

public class Contato {
	
	private String nome;
	private Endereco enderešo;
	private Telefone[] telefones;
	
	public Contato() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public Endereco getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(Endereco enderešo) {
		this.enderešo = enderešo;
	}

	public Telefone[] getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

	
	
	

}
