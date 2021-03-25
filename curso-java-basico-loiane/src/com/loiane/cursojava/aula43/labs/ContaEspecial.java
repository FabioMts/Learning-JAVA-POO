package com.loiane.cursojava.aula43.labs;

public class ContaEspecial extends ContaBancaria{

	private Double limite;
	
	
	
	public ContaEspecial() {
		super();
	}



	public ContaEspecial(String nomeCliente, String numConta, Double saldo, Double limite) {
		super(nomeCliente, numConta, saldo);
		this.limite = limite;
	}



	public Double getLimite() {
		return limite;
	}



	public void setLimite(Double limite) {
		this.limite = limite;
	}
	
	
	
}
