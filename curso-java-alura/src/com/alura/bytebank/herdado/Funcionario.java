package com.alura.bytebank.herdado;

//n�o pode istanciar dessa classe, pq � abstrata
public abstract class Funcionario {
	
	private String name;
	private String cpf;
	private double salario;
	
	// metodo sem corpo, nao h� implementa��o(apenas nas classes filhas)
	public abstract double getBonificacao();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
