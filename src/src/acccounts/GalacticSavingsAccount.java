package src.acccounts;

import src.enums.AccountType;

import java.util.UUID;

public class GalacticSavingsAccount extends GalacticBankAccount{
    public GalacticSavingsAccount(UUID accountId, int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountId, accountNumber, accountHolder, balance, interestRate);
    }

    public String toString() {
        return super.toString() + "\n" +
                "Account Type: " + AccountType.SAVINGS ;
    }
}
