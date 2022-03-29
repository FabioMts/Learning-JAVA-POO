package app;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of taxpayers: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            System.out.println("Taxpayer #" + i + " data: ");
            System.out.print("Individual or company (i/c): ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if(type == 'i') {
                System.out.print("Health Expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            }
            else {
                System.out.print("Number of employees: ");
                Integer numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID: ");


        for(TaxPayer tp : list) {
            System.out.println(tp.getName() + ": $ " + tp.tax());
        }

        System.out.println();

        double sum = 0.0;
        for(TaxPayer tp : list) {
            sum += tp.tax();
        }
        System.out.println("TOTAL TAXES: $ " + sum);







        sc.close();



    }



}
