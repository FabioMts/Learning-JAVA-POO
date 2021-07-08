package com.loiane.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {
	
	private T[] elementos;
	private int tamanho;

	public Lista(int capacidade) {
		this.elementos = (T[])new Object[capacidade];
		this.tamanho = 0;
	}
	
	

	public boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;

	}

	public boolean adiciona(int posicao, T elemento) {

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicão invalida");
		}

		this.aumentaCapacidade();

		// mover todos os elementos
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}

	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[])new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

//OBTER ELEMENTO DE UMA POSIÇÃO
	public Object busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicão invalida");
		}
		return this.elementos[posicao];
	}

//VERIFICAR SE ELEMENTO EXISTE NO VETOR
	public int busca(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	// B G D E F -> posição a ser removida é 1 (G)
	// 0 1 2 3 4 -> tamanho do vetor é 5
	// vetor[1] = vetor[2]
	// vetor[2] = vetor[3]
	// vetor[3] = vetor[4]
	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicão invalida");
		}
		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;

	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}
		s.append("]");

		return s.toString();
	}

}
