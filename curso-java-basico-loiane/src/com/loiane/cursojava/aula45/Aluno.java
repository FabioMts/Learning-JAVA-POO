package com.loiane.cursojava.aula45;

public class Aluno extends Pessoa{
	
	
	private String curso;
	private String notas;
	

	
	public Aluno() {
		
		super();
		
	}
	
	
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.curso = curso;
	
	}


	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getNotas() {
		return notas;
	}
	public void setNotas(String notas) {
		this.notas = notas;
	}
	
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}

	
	
	public void metodoQualquer() {
		super.setCpf("123456");
		
		this.setCpf("3736163");
	
	}
	
	public String obterEtiquetaEndereco() {
		String s = "Endereco do aluno: ";
		s += this.getEndereco();
		
		return s;
	}
	
	
}
