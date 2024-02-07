/*
        Daniel McCarragher
        SDEV 219 - Object-Oriented Program
        File -- GalacticCheckingAccount.java

        This file is the class for the checking accounts

        */

package src.acccounts;

import src.enums.AccountType;

import java.util.UUID;

public class GalacticCheckingAccount extends GalacticBankAccount {

    public GalacticCheckingAccount(UUID accountId, int accountNumber, String accountHolder,
                                   double balance, double interestRate, double overdraftLimit) {
        super(accountId, accountNumber, accountHolder, balance, interestRate);
        this.overdraftLimit = overdraftLimit;
    }

    private double overdraftLimit;

    public double getOverdraftLimit(){
        return overdraftLimit;
    }

    public String toString() {
        //
        String superString = super.toString();

        return superString + "\n"+
                "Account Type: " + AccountType.CHECKING + "\n" +
                "Overdraft Limit: " + overdraftLimit + "\n";
    }
    }

