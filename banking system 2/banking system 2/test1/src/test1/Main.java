package test1;

public class Main {

    public static void main(String[] args) {

        // Create an account
        Account myAccount = new Account(
                "ACC1001",
                "Tumwine Ivan",
                1234,
                500000
        );

        // Create bank
        Bank bank = new Bank(myAccount);

        // Welcome message
     
        System.out.println("      WELCOME TO DTB BANK");
        

        // Login
        if (bank.login()) {

            // Start banking system
            bank.startBanking();

        } else {

            System.out.println("Account locked.");
        }
    }
}