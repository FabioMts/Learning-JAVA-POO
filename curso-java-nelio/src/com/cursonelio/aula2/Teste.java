package com.cursonelio.aula2;

public class Teste {

	public static void main(String[] args) {

		
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bcc = new BusinessAccount(1002, "Maria", 0.0, 5000.0);
		
		
		//UPCASTING
		
		Account acc1 = bcc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}

}
