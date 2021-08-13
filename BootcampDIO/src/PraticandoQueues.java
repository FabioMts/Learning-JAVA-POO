import java.util.LinkedList;
import java.util.Queue;

public class PraticandoQueues {

	public static void main(String[] args) {

		
		Queue<String> filaBanco = new LinkedList<String>();
		
		filaBanco.add("Juliana");
		filaBanco.add("Pedro");
		filaBanco.add("Carlos");
		filaBanco.add("Larissa");
		filaBanco.add("João");
		
		for (String nomesClientesDaFila: filaBanco) {
			System.out.println(nomesClientesDaFila);
		}
		System.out.println("----------------");
		String primeiroDaFila = filaBanco.peek();
		System.out.println(primeiroDaFila);

		System.out.println("----------------");
		String primeiroAtendidoDaFila = filaBanco.poll();
		System.out.println(primeiroAtendidoDaFila);
		
		filaBanco.add("Daniel");
		
		System.out.println(filaBanco);
		
		int tamanhoDaFila = filaBanco.size();
		System.out.println(tamanhoDaFila);
		
		boolean estaVazia = filaBanco.isEmpty();
		System.out.println(estaVazia);
		
		boolean contemNomeNaFila = filaBanco.contains("Carlos");
		System.out.println(contemNomeNaFila);
		
	}

}
