
public class TesteGerente {

	public static void main(String[] args) {
		
		
		Autenticavel referencia = new Gerente();
		
		Gerente g1 = new Gerente();
		g1.setName("Marco Aur�lio");
		g1.setCpf("23456787");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getName());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		
		
		g1.setSenha(222);
		boolean autenticou = g1.autentica(222);
		
		System.out.println(autenticou);
		
		
		System.out.println(g1.getBonificacao());

	}

}
