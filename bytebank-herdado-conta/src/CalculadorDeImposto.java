
public class CalculadorDeImposto {
	
	private double totalmposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalmposto += valor;
	}

	
	public double getTotalmposto() {
		return totalmposto;
	}
	
	
}
