import java.util.HashSet;
import java.util.Set;

public class PraticandoSet {

	public static void main(String[] args) {

		
		Set<Double> notas = new HashSet<Double>();
		
		notas.add(3.0);
		notas.add(88.0);
		notas.add(20.0);
		notas.add(44.0);
		notas.add(3.0);
		
		for (double todasNotas: notas) {
			System.out.println(todasNotas);
		}
		
		notas.remove(20.0);
		System.out.println(notas);
		
		notas.add(23.0);
		
		System.out.println(notas.size());
		
		boolean estaVazio = notas.isEmpty();
		System.out.println(estaVazio);
	}

}
