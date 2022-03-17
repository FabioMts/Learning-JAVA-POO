package app;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> listEmployee = new ArrayList<Employee>();

        System.out.print("How many employees will be registered? ");
        int N = sc.nextInt();
        System.out.println();

        for(int i=1; i<=N; i++) {

            System.out.println("Employee: #" + i);
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("NAME: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("SALARY: ");
            double salary = sc.nextDouble();

            listEmployee.add(new Employee(id, name, salary));
        }


        System.out.println();
        System.out.print("Enter the employee ID that will have salary increase: ");
        int id = sc.nextInt();

        Employee emp = listEmployee.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }
        System.out.println();

        for(Employee obj : listEmployee) {
            System.out.println(obj);
        }

        sc.close();


    }


}
