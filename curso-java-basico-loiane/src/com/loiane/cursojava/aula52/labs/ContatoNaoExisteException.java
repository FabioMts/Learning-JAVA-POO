package com.loiane.cursojava.aula52.labs;

public class ContatoNaoExisteException extends Exception{
	
	private String nomeContato;

	
	
	public ContatoNaoExisteException(String nomeContato) {
		super();
		this.nomeContato = nomeContato;
	}
	
	@Override
	public String getMessage() {
	return "Contato " + nomeContato + " não existe na Agenda.";
	}
}
