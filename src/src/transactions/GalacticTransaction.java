package src.transactions;

import src.enums.TransactionType;

import java.time.LocalDateTime;
import java.util.UUID;
/*
        Daniel McCarragher
        SDEV 219 - Object-Oriented Program
        File -- GalacticTransaction.java

        This file is the class for the Galactic Bank Transactions

        */

public class GalacticTransaction {
    private UUID transactionId;
    private int accountId;
    private LocalDateTime timestamp;
    private TransactionType transactionType;
    private double amount;

    public GalacticTransaction(UUID transactionId, int accountId, LocalDateTime timestamp,
                               TransactionType transactionType, double amount) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.timestamp = timestamp;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public String toString() {
        return "Transaction Id: " + transactionId + "\n" +
                "Account Id: " + accountId+ "\n" +
                "Timestamp: " + timestamp + "\n" +
                "Transaction Type: " + transactionType + "\n" +
                "Amount: " + amount + "\n";
    }
}
