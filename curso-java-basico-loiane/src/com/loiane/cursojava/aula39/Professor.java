package com.loiane.cursojava.aula39;

public class Professor extends Pessoa{
	
	
	private String salario;
	private double nomeCurso;
	
	
	public void verificarAcesso() {
		 this.nomeVisibilidade = "Maria";
		 super.nomeVisibilidade = "Maria";
		 
		 
		 super.setNomeVisibilidade("Maria");
		}
	

	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	public double getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(double nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	
	public double calcularSalarioLiquido() {
		return 0;
	}
	

}
