package com.alura.bytebank.herdado.conta;
public class TesteTributaveis {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto cal = new CalculadorDeImposto();
		cal.registra(cc);
		cal.registra(seguro);
		
		
		System.out.println(cal.getTotalmposto());
		
	}

}
