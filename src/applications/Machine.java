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
}
