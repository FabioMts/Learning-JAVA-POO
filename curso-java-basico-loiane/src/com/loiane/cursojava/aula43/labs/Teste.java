package com.loiane.cursojava.aula43.labs;

public class Teste {

	public static void main(String[] args) {

		System.out.println("*** Teste ContaBancaria ***");
		
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Cliente Conta Simples");
		contaSimples.setNumConta("11111");
		
		
		contaSimples.depositar(100);
		
		realizarSaque(contaSimples, 50);
		realizarSaque(contaSimples, 70);

		
		System.out.println(contaSimples);
		
	}
	
	private static void realizarSaque(ContaBancaria conta, double valor) {
		if(conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso. Novo saldo: " + conta.getSaldo());
		}else {
			System.out.println("Saldo insuficiente para saque de " + 50 + "; saldo de = " + conta.getSaldo());
		}
		
	}

}
