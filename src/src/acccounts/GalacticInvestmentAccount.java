/*
        Daniel McCarragher
        SDEV 219 - Object-Oriented Program
        File -- GalacticInvestmentAccount.java

        This file is the class for the Investment accounts

        */

package src.acccounts;

import src.enums.AccountType;

import java.util.UUID;

public class GalacticInvestmentAccount extends GalacticBankAccount {

    private double investmentReturnRate;
    public GalacticInvestmentAccount(UUID accountId, int accountNumber,
                                     String accountHolder, double balance, double interestRate, double
                                     investmentReturnRate) {
        super(accountId, accountNumber, accountHolder, balance, interestRate);
        this.investmentReturnRate = investmentReturnRate;
    }

    public double getInvestmentReturnRate(){
        return investmentReturnRate;
    }

    public String toString(){
        String superString = super.toString();
        return superString + "\n" +
                "Account Type: " + AccountType.INVESTMENT + "\n" +
                "Investment Return Rate: " + investmentReturnRate + "\n";
    }
}
