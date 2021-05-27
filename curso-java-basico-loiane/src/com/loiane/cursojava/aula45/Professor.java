package com.loiane.cursojava.aula45;

public class Professor extends Pessoa{
	
	
	private String salario;
	private double nomeCurso;
	

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
	
	public String obterEtiquetaEndereco() {
		String s = "Endereco do professor: ";
		s += this.getEndereco();
		
		return s;
	}
	
	

}
