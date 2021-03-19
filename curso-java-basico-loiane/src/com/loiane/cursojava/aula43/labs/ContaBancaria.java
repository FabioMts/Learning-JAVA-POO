package com.loiane.cursojava.aula43.labs;

public class ContaBancaria {

	protected String nomeCliente;
	protected String numConta;
	protected double saldo;
	
	
	public ContaBancaria() {
		
	}


	public ContaBancaria(String nomeCliente, String numConta, Double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public String getNumConta() {
		return numConta;
	}


	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}


	public double getSaldo() {
		return saldo;
	}


	public boolean sacar(double quantiaASacar) {
		if(saldo >= quantiaASacar) {
			saldo = saldo - quantiaASacar;
			return true;
		} 
		return false;
	}
	
	public void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	@Override
	public String toString() {
		String s = "ContaBancaria[";
		s += " nomeCliente: " + nomeCliente;
		s += " | numConta: " + numConta;
		s += " | Saldo: " + saldo;
		s += " ]";
		return s;
	}
	
}
