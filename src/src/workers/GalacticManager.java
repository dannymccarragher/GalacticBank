package src.workers;

import src.enums.WorkerType;

import java.util.UUID;

public class GalacticManager extends GalacticBankWorker{

    private String department;
    public GalacticManager(UUID workerId, String workerName, String department) {
        super(workerId, workerName, WorkerType.MANAGER);
        this.department = department;

    }

    public String getDepartment(){
        return department;
    }

    public String toString(){
        String superString = super.toString();
        return superString + "\n" +
                "Department: " + department + "\n"
                + "Worker Role: " + WorkerType.MANAGER;
    }
}
