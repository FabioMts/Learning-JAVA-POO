import java.util.ArrayList;
import java.util.Collections;

public class PraticandoArraylist {

	public static void main(String[] args) {

		
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("João");
		
		System.out.println(nomes);
		
		nomes.set(2, "Roberto");
		
		System.out.println(nomes);
		
		String nomeDoIndice = nomes.get(1);
		
		System.out.println(nomeDoIndice);
		
		nomes.remove(4);
		
		System.out.println(nomes);
		
		nomes.remove("João");
		
		System.out.println(nomes);
		
		int tamanhoDalista = nomes.size();
		
		System.out.println(tamanhoDalista);
		
		boolean temNaLista = nomes.contains("Juliano");
		
		System.out.println(temNaLista);
		
		ArrayList<String> nomes2 = new ArrayList<String>(nomes);
		
		nomes2.add("Ismael");
		nomes2.add("Rodrigo");
		nomes2.add("Fabio");
		
		System.out.println(nomes2);
		
		Collections.sort(nomes2);
		
		System.out.println(nomes2);

		boolean listaVazia = nomes2.isEmpty();
		
		System.out.println(listaVazia);
		
		for(String nomesdoArray: nomes2) {
			System.out.println(nomesdoArray);
		}
		
	}

}
