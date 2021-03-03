package com.loiane.cursojava.aula33.labs;

public class Aluno {
	
	private String nome;
	private String matricula;
	private String nomeCurso;
	private String[] nomeDisciplinas;
	private double[][] notasDisciplinas;
	
	public Aluno() {
		nomeDisciplinas = new String[3];
		notasDisciplinas = new double[3][4];
	}
	
	
	
	
	public Aluno(String nome, String matricula, String nomeCurso, String[] nomeDisciplinas,
			double[][] notasDisciplinas) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
		this.nomeDisciplinas = nomeDisciplinas;
		this.notasDisciplinas = notasDisciplinas;
		this.nomeDisciplinas = new String[3];
		this.notasDisciplinas = new double[3][4];
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNomeCurso() {
		return nomeCurso;
	}


	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}


	public String[] getNomeDisciplinas() {
		return nomeDisciplinas;
	}


	public void setNomeDisciplinas(String[] nomeDisciplinas) {
		this.nomeDisciplinas = nomeDisciplinas;
	}

	public double[][] getNotasDisciplinas() {
		return notasDisciplinas;
	}



	public void setNotasDisciplinas(double[][] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}


	public void mostrarInfo() {
		System.out.println("Nome: "+ nome);
		System.out.println("Matricula: "+ matricula);
		System.out.println("Nome do curso: " + nomeCurso);
		
		for(int i=0; i<notasDisciplinas.length; i++) {
			System.out.println("Notas da disciplina de " + nomeDisciplinas[i]);
			for(int j=0; j<notasDisciplinas[i].length; j++) {
				System.out.println(notasDisciplinas[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	public boolean verificarAprovado(int indice) {
		
		
		
		if(obterMedia(indice) >=7) {
		return true;
		} else {
			return false;
		}
		
	}
	
	public double obterMedia(int indice) {
		double soma = 0;
		
		for(int i=0; i<notasDisciplinas[indice].length; i++) {
			soma += notasDisciplinas[indice][i];
		}
		
		double media = soma/4;
		
		return media;	
	}
	
	public void setNomeDisciplinaPos(int pos, String nomeDisciplina) {
		this.nomeDisciplinas[pos] = nomeDisciplina; 
	}
	
	public void setNotaPosIJ(int posI, int posJ, double nota) {
		this.notasDisciplinas[posI][posJ] = nota;
		
	}
	
	
}
