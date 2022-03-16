package entities;

public class Account {

    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
        balance = 0;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        return balance += amount;
    }

    public double withdraw(double amount) {
         return balance -= amount + 5;
    }

    @Override
    public String toString() {
        return "Account data: \n" +
                "Account " + number +
                ", Holder: " + holder +
                ", balance: $" + balance;
    }
}
