package com.loiane.cursojava.aula43.labs;

public class ContaPoupanca extends ContaBancaria{
	
	private Double diaRendimento;

	
	public ContaPoupanca() {
		super();
	}


	public ContaPoupanca(String nomeCliente, String numConta, Double saldo, Double diaRendimento) {
		super(nomeCliente, numConta, saldo);
		this.diaRendimento = diaRendimento;
	}


	public Double getDiaRendimento() {
		return diaRendimento;
	}


	public void setDiaRendimento(Double diaRendimento) {
		this.diaRendimento = diaRendimento;
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
