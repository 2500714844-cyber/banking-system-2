package test1;

import java.util.ArrayList;

public class Account {

    private String accountNumber;
    private String accountName;
    private int pin;
    private double balance;

    private ArrayList<String> transactions;

    // Constructor
    public Account(String accountNumber, String accountName, int pin, double balance) {

        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.pin = pin;
        this.balance = balance;

        transactions = new ArrayList<>();

        transactions.add("Account opened with balance: UGX " + balance);
    }

    // Check PIN
    public boolean checkPin(int enteredPin) {

        return pin == enteredPin;
    }

    // Deposit money
    public void deposit(double amount) {

        if (amount > 0) {

            balance += amount;

            transactions.add("Deposited: UGX " + amount);

            System.out.println("Deposit successful!");

        } else {

            System.out.println("Invalid amount.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {

        if (amount <= 0) {

            System.out.println("Invalid amount.");

        } else if (amount > balance) {

            System.out.println("Insufficient balance.");

        } else {

            balance -= amount;

            transactions.add("Withdrawn: UGX " + amount);

            System.out.println("Withdrawal successful!");
        }
    }

    // Display balance
    public void showBalance() {

        System.out.println("Current Balance: UGX " + balance);
    }

    // Display account information
    public void showAccountDetails() {

        System.out.println("ACCOUNT DETAILS ");

        System.out.println("Account Number: " + accountNumber);

        System.out.println("Account Name: " + accountName);

        // TERNARY STATEMENT
        String status = balance > 0 ? "Active" : "Empty";

        System.out.println("Account Status: " + status);

        System.out.println("Balance: UGX " + balance);
    }

    // Display transactions
    public void showTransactions() {

        System.out.println("TRANSACTION HISTORY ");

        // FOR LOOP
        for (int i = 0; i < transactions.size(); i++) {

            System.out.println((i + 1) + ". " + transactions.get(i));
        }
    }
}