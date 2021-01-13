
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.20;
		return super.saca(valorASacar);
	}
	
//	@Override
//	public boolean transfere(double valor, Conta destino) {
//		double valorASacar = valor + 0.20;
//		return super.transfere(valorASacar, destino);
//	}
//	
}
