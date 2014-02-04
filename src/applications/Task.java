package applications;

public class Task {
    // data members
    private int machine;
    private int time;

    // constructor
    Task(int theMachine, int theTime) {
        machine = theMachine;
        time = theTime;
    }

    int getMachine() {
        return machine;
    }

    int getTime() {
        return time;
    }
}
