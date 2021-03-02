package com.alura.bytebank.herdado;
public class TesteFuncionario {

	public static void main(String[] args) {
		
		
		Cliente cliente = new Cliente();
			
		Gerente nico = new Gerente();
		nico.setName("Nico Steppat");
		nico.setCpf("2224456-6");
		nico.setSalario(2600.00);
		
		
		System.out.println(nico.getName());
		System.out.println(nico.getBonificacao());
		
	}

}
