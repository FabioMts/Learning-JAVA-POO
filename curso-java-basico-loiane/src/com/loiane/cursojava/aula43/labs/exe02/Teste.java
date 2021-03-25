package com.loiane.cursojava.aula43.labs.exe02;

public class Teste {
	
	public static void main(String[] args) {
		
		
		PessoFisica p1 = new PessoFisica();
		p1.setNome("Contribuinte 01");
		p1.setRendaBruta(1000);
		p1.setCpf("296.736.510-60");
		
		PessoaJuridica p2 = new PessoaJuridica();
		p2.setNome("Contribuinte 02");
		p2.setRendaBruta(5000);
		p2.setCnpj("95.690.096/0001-73");

		PessoFisica p3 = new PessoFisica();
		p3.setNome("Contribuinte 03");
		p3.setRendaBruta(200);
		p3.setCpf("977.571.000-62");
		
		
		PessoaJuridica p4 = new PessoaJuridica();
		p4.setNome("Contribuinte 04");
		p4.setRendaBruta(3000);
		p4.setCnpj("19.931.705/0001-50");

		
		PessoFisica p5 = new PessoFisica();
		p5.setNome("Contribuinte 05");
		p5.setRendaBruta(3700);
		p5.setCpf("596.231.120-50");
		
		
		PessoaJuridica p6 = new PessoaJuridica();
		p6.setNome("Contribuinte 06");
		p6.setRendaBruta(4000);
		p6.setCnpj("91.662.620/0001-41");
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = p4;
		contribuintes[4] = p5;
		contribuintes[5] = p6;
		
		for(Contribuinte c : contribuintes) {
			System.out.println(c.toString());
		}

	}
	

}
