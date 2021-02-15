package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);

		//ex 1
		
//		boolean notaValida = false;
//		
//		do {
//			
//			System.out.println("Digite uma nota (entre 0 e 10): ");
//			double nota = scan.nextDouble();
//			
//			
//			if(nota >= 0 && nota <= 10 ) {
//				notaValida = true;
//				System.out.println("Sua nota é: " + nota);
//
//			}else {
//				System.out.println("Nota inválida, digite novamente: ");
//				
//			}
//			
//		}while (!notaValida);
		
		// ex 2
		
//		boolean senhaValida = false;
//		
//		do {
//			
//		
//		
//		System.out.println("Digite um nome de usuario: ");
//		String nome = scan.next();
//		System.out.println("Digite uma senha: ");
//		String senha = scan.next();
//		
//		if(nome.equalsIgnoreCase(senha)) {
//			senhaValida = false;
//			System.out.println("Senha inválida.");
//
//		}else {
//			senhaValida = true;
//			System.out.println("Seu usúario foi cadastrado com sucesso.");
//
//		}
//		
//		}while(!senhaValida);
//		
//		
		
		
		//ex 3
		
//		boolean infoValida = false;
//		String nome, sexo, estadoCivil;
//		int idade;
//		double salario;
//		
//		do {
//			System.out.println("Entre com o nome: ");
//			nome = scan.next();
//			
//			if(nome.length() >= 3) {
//				infoValida = true;
//			}else {
//				System.out.println("Nome precisa no mínimo 3 caracteres.");
//			}
//		} while(!infoValida);
//		
//		infoValida = false;
//		do {
//			System.out.println("Entre com a idade: ");
//			idade = scan.nextInt();
//			
//			if(idade >= 0 && idade <= 150) {
//				infoValida = true;
//			}else {
//				System.out.println("Idade precisa ser entre 0 e 150.");
//			}
//		} while(!infoValida);
//		
//		infoValida = false;
//		do {
//			System.out.println("Entre com o salário:  ");
//			salario = scan.nextDouble();
//			
//			if(salario > 0) {
//				infoValida = true;
//			}else {
//				System.out.println("Salário precisa ser maior que 0.");
//			}
//		} while(!infoValida);
//		
//		infoValida = false;
//		do {
//			System.out.println("Entre com o genero:  ");
//			sexo = scan.next();
//			
//			if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
//				infoValida = true;
//			}else {
//				System.out.println("Salário precisa ser 'f' ou 'm'.");
//			}
//		} while(!infoValida);
//		
//		infoValida = false;
//		do {
//			System.out.println("Entre com o estado civil:  ");
//			estadoCivil = scan.next();
//			
//			if(estadoCivil.equalsIgnoreCase("s") ||
//				estadoCivil.equalsIgnoreCase("c") ||
//				estadoCivil.equalsIgnoreCase("v") ||
//				estadoCivil.equalsIgnoreCase("d")) {
//				infoValida = true;
//			}else {
//				System.out.println("Estado Civil precisa ser 's' -  'c' - 'v' ou 'd'.");
//			}
//		} while(!infoValida);
//		
//		
//		System.out.println("As seguintes informações foram coletadas");
//		System.out.println("Nome: " + nome);
//		System.out.println("Idade: " + idade);
//		System.out.println("Salario: " + salario);
//		System.out.println("Sexo: " + sexo);
//		System.out.println("Estado Civil: " + estadoCivil);

		
		
		// ex 4
		
//		int popA = 80000;
//		int popB = 200000;
//		int cont = 0;
//		
//		
//		while (popA < popB) {
//			
//			popA += (popA/100) * 3;
//			popB += (popB/100) * 1.5;
//			cont++;
//		}
//		
//		System.out.println("População A: " + popA);
//		System.out.println("População B: " + popB);
//		System.out.println("Quantidade de anos: " + cont);

		
		
		
		
		// ex 5
		
//		double popA;
//		double popB;
//		double taxaA;
//		double taxaB;
//		
//		boolean valido = false;
//		
//		do {
//			
//			System.out.println("Entre com a população A: ");
//			popA = scan.nextDouble();
//			
//			if(popA > 0) {
//				valido = true;
//			}else {
//				System.out.println("População A precisa ser maior que 0.");
//			}
//		}while (!valido);
//
//		 valido = false;
//		
//		do {
//			
//			System.out.println("Entre com a população B: ");
//			popB = scan.nextDouble();
//			
//			if(popB > 0) {
//				valido = true;
//			}else {
//				System.out.println("População B precisa ser maior que 0.");
//			}
//		}while (!valido);
//		
//		
//		 valido = false;
//			
//			do {
//				
//				System.out.println("Entre com a taxa de crescimento da população A: ");
//				taxaA = scan.nextDouble();
//				
//				if(taxaA > 0) {
//					valido = true;
//				}else {
//					System.out.println("A taxa de crescimento da população A precisa ser maior do que 0.");
//				}
//			}while (!valido);
//			
//			valido = false;
//			
//			do {
//				
//				System.out.println("Entre com a taxa de crescimento da população B: ");
//				taxaB = scan.nextDouble();
//				
//				if(taxaB > 0) {
//					valido = true;
//				}else {
//					System.out.println("A taxa de crescimento da população B precisa ser maior do que 0.");
//				}
//			}while (!valido);
//		
//			
//			int cont = 0;
//			
//			while (popA < popB) {
//				
//				popA += (popA/100) * taxaA;
//				popB += (popB/100) * taxaB;
//				cont++;
//			}
//			
//			System.out.println("População A: " + popA);
//			System.out.println("População B: " + popB);
//			System.out.println("Quantidade de anos: " + cont);
//				
//			
			//ex 6
		
//			for(int i =0; i <=20; i++) {
//				System.out.print(i + " ");
//			}
//			
		
			//ex 7
		
		
//		int num;
//		int maior = Integer.MIN_VALUE;
//			for(int i =0; i<5; i++) {
//				System.out.println("Entre com um número: ");			
//				num = scan.nextInt();
//				
//				if(num > maior) {
//					maior = num;
//				}
//				
//				
//			}
//				
//				System.out.println("O maior número digitado foi: " + maior);
		
		
		
		
		
			//ex 8
//		
//		int num;
//		int soma=0;
//		double media;
//		
//			for(int i =0; i<5; i++) {
//				System.out.println("Entre com um número: ");			
//				num = scan.nextInt();
//		
//				soma += num;
//				
//			}
//			media = soma/5;
//			System.out.println("Soma: " + soma + " | Media: " + media);
		
		
		
		//ex 9
		
//			for(int i=0; i < 50; i++) { 
//		
//			if(i % 2 != 0) {
//				System.out.println(i);
//			}
//		}
//		
		
		//ex 10
		
//		System.out.println("Entre com o primeiro numero: ");
//		int num1 = scan.nextInt();
//		System.out.println("Entre com o segundo numero: ");
//		int num2 = scan.nextInt();
//		
//		for(int i=num1; i<= num2; i++) {
//			System.out.println(i);
//		}
		
		
		//ex 11
		
//		double soma = 0;
//		System.out.println("Entre com o primeiro numero: ");
//		int num1 = scan.nextInt();
//		System.out.println("Entre com o segundo numero: ");
//		int num2 = scan.nextInt();
//		
//		for(int i=num1; i<= num2; i++) {
//			soma += i;
//		}
//		System.out.println("soma: " + soma);

		
		
		//ex 12
//			int num;
//			
//			System.out.println("Digite o número que deseja ver a tabuada: ");
//			num = scan.nextInt();
//			
//			System.out.println("Tabuada de " + num + ": ");
//			
//			for(int i=0; i <=10; i++) {
//				System.out.println(num + " x " + i + " = " + num * i);
//			}
			
		// ex 13
		
//			System.out.println("Entre com a base: ");
//			int base = scan.nextInt();
//			System.out.println("Entre com a potência: ");
//			int pot = scan.nextInt();
//			
//			int resultado = base;
//			
//			for(int i=1; i<pot; i++) {
//				resultado *= base;
//			}
//		System.out.println("Resultado: " + resultado);
		
		
		
		//ex 14
		
//		
//		int num;
//		int pares = 0;
//		int impares = 0;
//		
//		for(int i =0; i <= 10; i++) {
//			System.out.println("Entre com um número");
//			num = scan.nextInt();
//			
//			if (num % 2 ==0) {
//				pares++;
//			}else {
//				impares++;
//			}
//		}
//			System.out.println("Pares: " + pares);
//			System.out.println("impares: " + impares);
		
		
		// ex 15
		
//		System.out.println("Entre com o n-ésimo termo da serie de fibonacci: ");
//		int n = scan.nextInt();
//		
//		int primeiro = 1;
//		int segundo = 1;
//		int proximo;
//		 
//		
//		for(int i = 3; i<=n; i++) {
//			proximo = primeiro + segundo;
//			primeiro = segundo;
//			segundo = proximo;
//			
//			System.out.println(proximo);
//		}
//		
//		
		
		
		}
	}


