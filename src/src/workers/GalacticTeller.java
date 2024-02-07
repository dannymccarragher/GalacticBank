package src.workers;

import src.enums.WorkerType;

import java.util.UUID;

public class GalacticTeller extends GalacticBankWorker {

    private int numberOfTransactions;

    public GalacticTeller(UUID workerId, String workerName, int numberOfTransactions) {
        super(workerId, workerName, WorkerType.TELLER);
        this.numberOfTransactions = numberOfTransactions;
    }


    public int getNumberOfTransactions(){
        return numberOfTransactions;
    }

    public String toString() {
            String superString = super.toString();
            return superString + "\n" +
                    "Number of Transactions: " + numberOfTransactions + "\n"
                    + "Worker Role: " + WorkerType.TELLER;
        }
    }

