package applications;

import dataStructures.LinkedQueue;

public class Job {
    // data members
    private LinkedQueue taskQ; // this job's tasks
    private int length; // sum of scheduled task times
    private int arrivalTime; // arrival time at current queue
    private int id; // job identifier

    // constructor
    public Job(int theId) {
        setId(theId);
        setTaskQ(new LinkedQueue());
        // length and arrivalTime have default value 0
    }

    // other methods
    public void addTask(int theMachine, int theTime) {
        getTaskQ().put(new Task(theMachine, theTime));
    }

    // remove next task of job and return its time also update length
    public int removeNextTask() {
        int theTime = ((Task) getTaskQ().remove()).getTime();
        setLength(getLength() + theTime);
        return theTime;
    }

    public void setTaskQ(LinkedQueue taskQ) {
        this.taskQ = taskQ;
    }

    public LinkedQueue getTaskQ() {
        return taskQ;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
