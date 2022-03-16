package app;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Account account;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit value (y/n)? ");
        char resp = sc.next().charAt(0);

        if(resp == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
             account = new Account(number, holder, initialDeposit);
        }else {
             account = new Account(number, holder);
        }
        System.out.println();
        System.out.println(account);
        System.out.println();

        System.out.println("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);
        System.out.println(account);

        System.out.println();

        System.out.println("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.println(account);




        sc.close();
    }

}
