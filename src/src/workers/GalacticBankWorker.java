package src.workers;

import src.enums.WorkerType; // Import WorkerType enum

import java.util.UUID;

public class GalacticBankWorker {

    private UUID workerId;
    private String workerName;
    private WorkerType workerType;


    public GalacticBankWorker(UUID workerId, String workerName, WorkerType workerType)
    {
        this.workerId = workerId;
        this.workerName = workerName;
        this.workerType = workerType;
    }

    public UUID getWorkerId(){
        return workerId;
    }

    public String getWorkerName(){
        return workerName;
    }

    public WorkerType getWorkerType() {
        return workerType;
    }

    public String toString(){
        return "Worker Id: " + workerId + "\n" +
                "Worker Name: " + workerName;
    }
}
