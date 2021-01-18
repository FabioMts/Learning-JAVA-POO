
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente nico = new Gerente();
		nico.setName("Nico Steppat");
		nico.setCpf("2224456-6");
		nico.setSalario(2600.00);
		
		
		System.out.println(nico.getName());
		System.out.println(nico.getBonificacao());
		
	}

}
