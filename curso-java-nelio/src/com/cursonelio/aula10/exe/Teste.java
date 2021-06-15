package com.cursonelio.aula10.exe;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered? ");
		int NumberofEmployees = sc.nextInt();
		
		List<Employees> list = new ArrayList<Employees>();
		
		for(int i = 1; i <= NumberofEmployees; i++) {
			System.out.println("Employee #" + i + ": ");
			System.out.println("Id: ");
			int id = sc.nextInt();
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			
			Employees x = new Employees(id, name, salary);
			list.add(x);
		}

		
	}

}
