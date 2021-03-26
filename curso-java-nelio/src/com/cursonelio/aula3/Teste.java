package com.cursonelio.aula3;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	public static void main(String[] args) {
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005,"Anna", 500.0, 500.0));
		
		double soma = 0;
		
		for(Account acc : list) {
			soma += acc.getBalance();
		}
		
		System.out.println("Total balance: " + soma);
		
		for(Account acc : list) {
			acc.deposit(10.0);
		}
		for(Account acc : list) {
			System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}

}
