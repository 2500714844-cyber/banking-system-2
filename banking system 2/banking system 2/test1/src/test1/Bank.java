package test1;

import java.util.Scanner;

public class Bank {

    private Account account;
    private Scanner scanner;

    public Bank(Account account) {

        this.account = account;

        scanner = new Scanner(System.in);
    }

    // Login system
    public boolean login() {

        int attempts = 0;

        // WHILE LOOP
        while (attempts < 3) {

            System.out.print("Enter your PIN: ");

            int enteredPin = scanner.nextInt();

            if (account.checkPin(enteredPin)) {

                System.out.println("\nLogin successful!");

                return true;

            } else {

                attempts++;

                System.out.println("Incorrect PIN.");

                System.out.println("Attempts remaining: " + (3 - attempts));
            }
        }

        System.out.println("\nToo many incorrect attempts.");

        return false;
    }

    // Banking menu
    public void startBanking() {

        int choice;

        // DO-WHILE LOOP
        do {

            
            System.out.println("       SIMPLE BANKING SYSTEM");
            
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Account Details");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");

            System.out.print("\nChoose an option: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    account.showBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: UGX ");

                    double depositAmount = scanner.nextDouble();

                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: UGX ");

                    double withdrawAmount = scanner.nextDouble();

                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    account.showAccountDetails();
                    break;

                case 5:
                    account.showTransactions();
                    break;

                case 6:
                    System.out.println("\nThank you for using our bank!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 6);
    }
}