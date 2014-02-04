package applications;

import dataStructures.LinkedQueue;

public class Job {
    // data members
    LinkedQueue taskQ; // this job's tasks
    int length; // sum of scheduled task times
    int arrivalTime; // arrival time at current queue
    int id; // job identifier

    // constructor
    Job(int theId) {
        id = theId;
        taskQ = new LinkedQueue();
        // length and arrivalTime have default value 0
    }

    // other methods
    void addTask(int theMachine, int theTime) {
        taskQ.put(new Task(theMachine, theTime));
    }

    /**
     * remove next task of job and return its time also update length
     */
    int removeNextTask() {
        int theTime = ((Task) taskQ.remove()).getTime();
        length += theTime;
        return theTime;
    }
}
