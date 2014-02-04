package applications;

import applications.Job;
import dataStructures.LinkedQueue;

public class Machine {
    // data members
    private LinkedQueue jobQ; // queue of waiting jobs for this machine
    private int changeTime; // machine change-over time
    private int totalWait; // total delay at this machine
    private int numTasks; // number of tasks processed on this machine
    private Job activeJob; // job currently active on this machine

    // constructor
    public Machine() {
        jobQ = new LinkedQueue();
    }

    // other methods
    public LinkedQueue getJobQ() {
        return jobQ;
    }

    public void setChangeTime(int changeTime) {
        this.changeTime = changeTime;
    }

    public int getChangeTime() {
        return changeTime;
    }

    public void setTotalWait(int totalWait) {
        this.totalWait = totalWait;
    }

    public int getTotalWait() {
        return totalWait;
    }

    public void setNumTasks(int numTasks) {
        this.numTasks = numTasks;
    }

    public int getNumTasks() {
        return numTasks;
    }

    public void setActiveJob(Job activeJob) {
        this.activeJob = activeJob;
    }

    public Job getActiveJob() {
        return activeJob;
    }
    
    public boolean hasNoWaitingJob() {
        return this.getJobQ().isEmpty();
    }
    
    public Object removeJobQ() {
        return this.getJobQ().remove();
    }
    
    public int getActiveArrivalTime() {
        return this.getActiveJob().getArrivalTime();
    }
    
    public int removeNextTaskFromActive() {
        return getActiveJob().removeNextTask();
    }
}
