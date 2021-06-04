package exercicioPOO2.nelio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of taxpayers: ");
		int N = sc.nextInt();
		
		List<TaxPayer> list = new ArrayList<TaxPayer>();
		

		for (int i = 1; i <= N; i++) {
			System.out.println("Taxpayer #" + i + " data:");
			System.out.println("Individual or Company (i/c)?");
			char type = sc.next().charAt(0);
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Anual income: ");
			Double anualIncome = sc.nextDouble();
			
			if(type == 'i') {
				System.out.println("Health expenditures");	
				Double healthExpenditures = sc.nextDouble();
				Individual x = new Individual(name, anualIncome, healthExpenditures);
				list.add(x);
			}
			else {
				System.out.print("Number of employees");
				Integer numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for(TaxPayer tp : list) {
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
		}
		
		System.out.println();
		double sum = 0;
		for(TaxPayer tp : list) {
			sum = tp.tax();
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
		}
		System.out.println("TOTAL TAXES: " + String.format("%.2f", sum));
		
		sc.close();
		
	}

}
