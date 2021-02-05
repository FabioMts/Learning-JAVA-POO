package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {

		
		//Exe 1
		Scanner scan = new Scanner(System.in);
		
		
		
//		System.out.println("Digite 2 números: ");
//
//		double num1 = scan.nextDouble();
//		double num2 = scan.nextDouble();
//				
//		if(num1 > num2) {
//			System.out.println("O maior número digitado foi: " + num1);
//		}else {
//			System.out.println("O maior número digitado foi: " + num2);
//		}
//		
		
		//Exe 2
//		
//		System.out.println("Digite qualquer valor: ");
//		
//		double num = scan.nextDouble();
//		
//		if(num >= 0) {
//			System.out.println("O numero é positivo.");
//		}else {
//			System.out.println("O numero é negativo.");
//		}
		
		
		//Exe 3
		
		
//		System.out.println("Entre com uma letra(F ou M): ");
//		String input = scan.next();
//		
//		
//		if (input.equalsIgnoreCase("f")) {
//			System.out.println("F - Feminino");
//		}else if(input.equalsIgnoreCase("m")) {
//			System.out.println("M - Masculino");
//		}else {
//			System.out.println("Sexo inválido.");
//		}
		
		
		//EXE 4
		
//		System.out.println("Digite uma letra: ");
//		String letra = scan.next();
//		
//		if(letra.equalsIgnoreCase("a") || 
//		letra.equalsIgnoreCase("e") ||
//		letra.equalsIgnoreCase("i") ||
//		letra.equalsIgnoreCase("o") ||
//		letra.equalsIgnoreCase("u")) {
//			
//			System.out.println("Vogal");
//		}else {
//			System.out.println("Consoante");
//		}
		
		
		
		//EX 5
		
//	
//		
//		System.out.println("Digite a primeira nota: ");
//		double nota1 = scan.nextDouble();
//
//		System.out.println("Digite a segunda nota: ");
//		double nota2 = scan.nextDouble();
//		
//		double media = (nota1 + nota2) / 2;
//		
//		if(media == 10) {
//			System.out.println("Aprovado com distinção");
//		}else if(media >= 7) {
//			System.out.println("Aprovado.");
//		}else {
//			System.out.println("Reprovado.");
//		}
		
		
		
		
		//EX 6
		
//		System.out.println("Digite o primeiro numero: ");
//		double num1 = scan.nextDouble();
//		
//		System.out.println("Digite o segundo numero: ");
//		double num2 = scan.nextDouble();
//		
//		System.out.println("Digite o terceiro numero: ");
//		double num3 = scan.nextDouble();
//		
//		if(num1 > num2 && num1 > num3) {
//			System.out.println("O maior numero é: " + num1);
//		}else if(num2 > num1 && num2 > num3) {
//			System.out.println("O maior numero é: " + num2);
//		}else if(num3 > num2 && num3 > num1) {
//			System.out.println("O maior numero é: " + num3);
//		}
		
		
		//EX 7
		
//		System.out.println("Digite o primeiro numero: ");
//		double num1 = scan.nextDouble();
//		
//		System.out.println("Digite o segundo numero: ");
//		double num2 = scan.nextDouble();
//		
//		System.out.println("Digite o terceiro numero: ");
//		double num3 = scan.nextDouble();
//		
//		if(num1 > num2 && num1 > num3) {
//			System.out.println("O maior numero é: " + num1);
//		}else if(num2 > num1 && num2 > num3) {
//			System.out.println("O maior numero é: " + num2);
//		}else if(num3 > num2 && num3 > num1) {
//			System.out.println("O maior numero é: " + num3);
//		}
//
//		if(num1 < num2 && num1 < num3) {
//			System.out.println("O menor numero é: " + num1);
//		}else if(num2 < num1 && num2 < num3) {
//			System.out.println("O menor numero é: " + num2);
//		}else if(num3 < num2 && num3 < num1) {
//			System.out.println("O menor numero é: " + num3);
//		}
		
		
		//EX 8
//		
//		System.out.println("Digite o valor do primeiro produto");
//		double valor1 = scan.nextDouble();
//		
//		System.out.println("Digite o valor do segundo produto");
//		double valor2 = scan.nextDouble();
//		
//		System.out.println("Digite o valor do terceiro produto");
//		double valor3 = scan.nextDouble();
//		
//		if(valor1 <= valor2 && valor1 <= valor3) {
//			System.out.println("Compre o primeiro produto.");
//		}else if(valor2 <= valor1 && valor2 <= valor3) {
//			System.out.println("Compre o segundo produto.");
//		}else if(valor3 <= valor2 && valor3 <= valor1) {
//			System.out.println("Compre o terceiro produto.");
//		}
		
		
		//EX 9
		
//		System.out.println("Digite o primeiro numero: ");
//		double num1 = scan.nextDouble();
//		
//		System.out.println("Digite o segundo numero: ");
//		double num2 = scan.nextDouble();
//		
//		System.out.println("Digite o terceiro numero: ");
//		double num3 = scan.nextDouble();
//		
//		if(num1 <= num2 && num1 <= num3 && num2 <= num3) {
//			//num1 é menor
//			//num 3 é maior
//			// num1 < num2 < num3
//			System.out.println(num3 + " - " + num2 + " - " + num1);
//		}else if(num1 <= num2 && num1 <= num3 && num3 <= num2) {
//			//num1 é menor
//			//num 2 é maior
//			// num1 < num3 < num2
//			System.out.println(num2 + " - " + num3 + " - " + num1);
//		}else if(num2 <= num1 && num2 <= num3 && num1 <= num3) {
//			//num2 é menor
//			//num 3 é maior
//			// num2 < num1 < num3
//			System.out.println(num3 + " - " + num1 + " - " + num2);
//		}else if(num2 <= num1 && num2 <= num3 && num3 <= num1) {
//			//num2 é menor
//			//num1 é maior
//			// num2 < num3 < num1
//			System.out.println(num1 + " - " + num3 + " - " + num2);
//		}else if(num3 <= num1 && num3 <= num2 && num1 <= num2) {
//			//num3 é menor
//			//num2 é maior
//			// num3 < num1 < num2
//			System.out.println(num2 + " - " + num1 + " - " + num3);
//		}else if(num3 <= num1 && num3 <= num2 && num2 <= num1) {
//			//num3 é menor
//			//num1 é maior
//			// num3 < num2 < num1
//			System.out.println(num1 + " - " + num2 + " - " + num3);
//		}
		
		
		
		//EX 10
		
//		System.out.println("Digite em que turno você estuda: \n"
//				+ "M - para Matutino, \n V - para Vespertino ou \n N - para noturno.");
//		
//		String turno = scan.next();
//		
//		switch(turno){
//			case "m":
//			case "M": System.out.println("Bom dia!"); break;
//			case "v":
//			case "V": System.out.println("Boa tarde!"); break;
//			case "n":
//			case "N": System.out.println("Booa noite!"); break;
//			default: System.out.println("Valor inválido!");
//		}
		
		
		//ex 11
		
//		System.out.println("Digite seu salario atual: ");
//		double salario = scan.nextDouble();
//		
//		double percentual = 0;
//		
//		if(salario < 280) {
//			percentual = 0.20;
//		}else if(salario >= 280 && salario < 700) {
//			percentual = 0.15;
//		}else if(salario >= 700 && salario < 1500) {
//			percentual = 0.10;
//		}else if(salario >= 1500) {
//			percentual = 0.05;
//		}
//		
//		double aumento = salario * percentual;
//		double salarioAjustado = salario + aumento;
//				
//				
//		System.out.println("O salario antes do reajuste era de " + salario); 
//		System.out.println("O percentual de aumento aplicado foi de: " + percentual);
//		System.out.println("o valor de aumento foi de: " + aumento);
//		System.out.println("o novo salario após o aumento é de: " + salarioAjustado);
		
		
		//EX 12
		
//		System.out.println("Digite o valor de sua hora de trabalho: ");
//		int valorHora = scan.nextInt();
//		System.out.println("Digite quantas horas trabalhou no mês: ");
//		int horasTrabalhadas = scan.nextInt();
//		
//		double salarioBruto = valorHora * horasTrabalhadas;
//		double percentual = 0;
//		
//		if(salarioBruto <= 900) {
//		percentual = 0;	
//		}else if(salarioBruto > 900 && salarioBruto <= 1500) {
//			percentual = 0.05;
//		}else if(salarioBruto > 1500 && salarioBruto <= 2500) {
//			percentual = 0.10;
//		}else if(salarioBruto > 2500) {
//			percentual = 0.20;
//		}
//		
//		double impostoRenda = salarioBruto * percentual;
//		double inss = salarioBruto * 0.10;
//		double fgts = salarioBruto * 0.11;
//		double totalDescontos = impostoRenda + inss;
//		double salarioLiquido = salarioBruto - totalDescontos;
//		
//		System.out.println("Salario bruto: " + salarioBruto);
//		System.out.println("(-) Imposto de renda: " + impostoRenda);
//		System.out.println("(-) INSS (10%): " + inss);
//		System.out.println("FGTS (11%): " + fgts);
//		System.out.println("Total de descontos: " + totalDescontos);
//		System.out.println("Salário liquido: " + salarioLiquido);
		
		
		// EX 13 
		
//		System.out.println("Digite um valor de 1 a 7: ");
//		int diaSemana = scan.nextInt();
//		
//		
//		switch(diaSemana) {
//		case 1: System.out.println("Domingo"); break;
//		case 2: System.out.println("Segunda"); break;
//		case 3: System.out.println("Terça"); break;
//		case 4: System.out.println("Quarta"); break;
//		case 5: System.out.println("Quinta"); break;
//		case 6: System.out.println("Sexta"); break;
//		case 7: System.out.println("Sabado"); break;
//		default: System.out.println("valor digitado inválido.");
//
//		}
		
		
		System.out.println("Digite sua primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite sua segunda nota: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		String conceito = "";
		
		if(media >= 9.0 && media <= 10) {
			conceito = "A";
		}else if(media >= 7.5 && media < 9) {
			conceito = "B";
		}else if(media >= 6.0 && media < 7.5) {
			conceito = "C";
		}else if(media >= 4.0 && media < 6.0) {
			conceito = "D";
		}else if(media >= 0 && media < 4.0) {
			conceito = "E";
		}
		
		
		
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Media: " + media);
		System.out.println("Conceito: " + conceito);
		
		switch(conceito) {
		case "A":
		case "B": 
		case "C": System.out.println("Aprovado"); break;
		case "D":
		case "E": System.out.println("Reprovado"); break;
		
		}
		
	}
	
}	


