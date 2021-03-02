package com.alura.bytebank.herdado;
//Gerente eh um funcionaro, Gerente herda da class Funcionario, assina o contrato Autenticavel, eh um Autenticavel

public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;

	private Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Bonificação do gerente");
		return super.getSalario();
	}

	
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
			
	}
		
	}

