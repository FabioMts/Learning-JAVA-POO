
public class FuncionarioTeste {
	
	private String name;
	private String cpf;
	private double salario;
	private int tipo = 0; // 0 -  funcionario comum, 1 - Gerente, 2 - Diretor
	
	
	public double getBonificacao() { // funcionario comum
		
		if(this.tipo == 0) {
			
			return this.salario * 0.1;
		}else if(this.tipo == 1) { //1 - Gerente
			return this.salario;
		}else { // 2 - Director 
			return this.salario + 1000;

		}
		
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
