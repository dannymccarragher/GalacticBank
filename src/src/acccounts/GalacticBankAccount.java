/*
        Daniel McCarragher
        SDEV 219 - Object-Oriented Program
        File -- GalacticBankAccount.java

        This file is the superclass for all of the various Bank Account classes

        */

package src.acccounts;

import src.enums.AccountType;

import java.util.UUID;

public class GalacticBankAccount {

    private UUID accountId;
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private double interestRate;
    private AccountType accountType;

    // Galactic Bank Account constructot
    public GalacticBankAccount(UUID accountId, int accountNumber, String accountHolder,
                               double balance, double interestRate) {
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    //accountId getter
    public UUID getAccountId() {
        return accountId;
    }
// AccountNumber getter
    public int getAccountNumber() {
        return accountNumber;
    }
//AccountHolder getter
    public String getAccountHolder() {
        return accountHolder;
    }
//Balance getter
    public double getBalance() {
        return balance;
    }
//interestrate getter
    public double getInterestRate() {
        return interestRate;
    }
//accountType getter
    public AccountType getAccountType() {
        return accountType;
    }
//Account type setter
    public void setAccountType(AccountType accountType) {
        if (accountType != null) {
            this.accountType = accountType;
        }
    }
    //toString
    public String toString() {
        return "Account Id: " + accountId + "\n" +
                "Account Number: " + accountNumber + "\n" +
                "Account Holder: " + accountHolder + "\n" +
                "Balance: " + balance + "\n" +
                "Interest Rate: " + interestRate;
    }
}
