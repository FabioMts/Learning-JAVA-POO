package com.loiane.cursojava.aula43.labs;

public class ContaPoupanca extends ContaBancaria{
	
	private int diaRendimento;

	
	public ContaPoupanca() {
		super();
	}


	public ContaPoupanca(String nomeCliente, String numConta, Double saldo, int diaRendimento) {
		super(nomeCliente, numConta, saldo);
		this.diaRendimento = diaRendimento;
	}


	public int getDiaRendimento() {
		return diaRendimento;
	}


	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	
	@Override
	public String toString() {
		String s = "ContaPoupanca[";
		s += " diaRendimento: " + diaRendimento;
		s += super.toString(); 
		s += " ]";
		return s;
	}
	
	
	@Override
	public boolean sacar(double quantiaASacar) {
		return super.sacar(quantiaASacar);
	}


	@Override
	public void depositar(double valorDepositado) {
		super.depositar(valorDepositado);
	}


	public void calcularNovoSaldo() {
		saldo += saldo * diaRendimento;
	}
	
	
	
	
}
