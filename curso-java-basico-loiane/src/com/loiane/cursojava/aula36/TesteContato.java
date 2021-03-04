package com.loiane.cursojava.aula36;

public class TesteContato {

	public static void main(String[] args) {

		Contato contato = new Contato();
		
		
		contato.setNome("Tyrion");
		//contato.setEndere�o("Kings landing");
		//contato.setTelefone("11 9999-9999");
		
		//relacionamento tem-um endereco
		Endereco end = new Endereco();
		end.setNomeRua("Game of Thrones");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("Kings Landing");
		end.setEstado("Westeros");
		end.setCep("9999999");
		
		contato.setEndere�o(end);
		
		//relacionamento tem-um telefone
		Telefone telefone = new Telefone();
		telefone.setTipo("Celular");
		telefone.setDdd("11");
		telefone.setNumero("99999-9999");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("Casa");
		telefone2.setDdd("11");
		telefone2.setNumero("8888-8888");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		contato.setTelefones(telefones);
		
		
		//Teste saida no console
		System.out.println(contato.getNome());
		
		if(contato != null && contato.getEndere�o() != null) {
			System.out.println(contato.getEndere�o().getCidade());
		}
		
//		if(contato != null && contato.getTelefone() != null) {
//			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
//		}
		
		if (contato != null && contato.getTelefones() != null) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
		
	}

}

