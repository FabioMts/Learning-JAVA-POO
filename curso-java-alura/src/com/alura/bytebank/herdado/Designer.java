package com.alura.bytebank.herdado;
import Funcionario;

public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("chamando o metodo de bonificacao do Designer");
		return 200;
	}

}
