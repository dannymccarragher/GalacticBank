/*
        Daniel McCarragher
        SDEV 219 - Object-Oriented Program
        File -- ConsoleProgram.java

        This file is the driver program for the program.
        This file will ask a user for input via scanner.
        The file will run until the users option is a 4.

        */

package src.program;

import src.bank.GalacticBank;
import src.enums.AccountType;

import java.util.Scanner;

public class ConsoleProgram {
    public static void main(String[] args) {
        // Create GalacticBank Object
        GalacticBank galacticBank = new GalacticBank();
        // Read accounts, transactions, and workers from files
        galacticBank.readAccountsFromFile("src/banking-files/accounts.csv");
        galacticBank.readTransactionsFromFile("src/banking-files/transactions.csv");
        galacticBank.readWorkersFromFile("src/banking-files/workers.csv");

        Scanner scanner = new Scanner(System.in);
        int option = 0;

        // While loop to keep running until 4 is entered
        while (option != 4) {
            // display menu options
            new drawGhost();
            System.out.println("Choose an Option:");
            System.out.println("1. Display Galactic Bank Accounts");
            System.out.println("2. Print Galactic Bank Transactions");
            System.out.println("3. Print Galactic Bank Workers");
            System.out.println("4. Exit");
            System.out.print("Enter your option: ");

            // get user input
            option = scanner.nextInt();
            scanner.nextLine();

            // Perform action based on user input
            if (option == 1) {
                System.out.println("Galactic Bank Accounts:");
                galacticBank.displayAccounts();
            } else if (option == 2) {
                System.out.println("Galactic Bank Transactions:");
                galacticBank.displayTransactions();
            } else if (option == 3) {
                System.out.println("Galactic Bank Workers:");
                galacticBank.displayWorkers();
            } else if (option == 4) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }

}
