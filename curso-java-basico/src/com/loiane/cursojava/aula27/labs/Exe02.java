package com.loiane.cursojava.aula27.labs;

public class Exe02 {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.valorEspececialUsado = 0;
		conta.saldo = -10;
		
		
		System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
		
		
		boolean saqueEfetuado = conta.realizarSaque(10);

		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso.");
			conta.consultarSaldo();			
		}else {
			System.out.println("N�o foi possivel realizar a opera��o. Saldo insuficiente.");
		}
		
		saqueEfetuado = conta.realizarSaque(500);
		System.out.println("Tentativa de saque de 500 reais.");
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso.");
			conta.consultarSaldo();			
		}else {
			System.out.println("N�o foi possivel realizar a opera��o. Saldo insuficiente.");
		}
	
		System.out.println("Deposito de 500 reais");
		conta.depositar(500);
		conta.consultarSaldo();		
		
		if(conta.verificarUsoChequeEspecial()) {
			System.out.println("Est� usando cheque especial");
		}else {
			System.out.println("N�o est� usando cheque especial.");
		}
		
		conta.realizarSaque(600);
		conta.consultarSaldo();
		if(conta.verificarUsoChequeEspecial()) {
			System.out.println("Est� usando cheque especial");
		}else {
			System.out.println("N�o est� usando cheque especial.");
		}
		
	}

}
