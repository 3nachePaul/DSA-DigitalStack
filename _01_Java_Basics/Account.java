package _01_Java_Basics;

public class Account {
    // Instance variables (Non-static fields)
    private String name;
    private double balance;

    // Class variables (static fields)
    private static int totalAccounts = 0;
    
    // Constructor with parameters
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
        totalAccounts++;
    }

    // Method: deposit
    public void deposit(double amount) {
        this.balance += amount;

        System.out.println("Depozit efectuat cu succes.");
    }

    // Method: withdraw
    public void withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("Fonduri insuficiente.");
            return;
        }
        this.balance -= amount;
        System.out.println("Ati retras cu succes suma de " + amount);
    }

    // Method: view account
    public void displayInfo() {
        System.out.println("Nume: " + name);
        System.out.println("Balanta: " + balance);
        System.out.println("Numar de conturi: " + totalAccounts);
    }

    public static void main(String[] args) {
        Account account1 = new Account("Ion", 5000);
        Account account2 = new Account("Andreea", 3800);

        account1.withdraw(500);
        account2.deposit(50);
        account1.displayInfo();
        account2.displayInfo();
    }

}