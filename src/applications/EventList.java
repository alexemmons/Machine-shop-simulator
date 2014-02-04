package applications;

public class EventList {
    // data members
    private int[] finishTime; // finish time array

    // constructor
    public EventList(int theNumMachines, int theLargeTime) {
        // initialize finish times for machines
        if (theNumMachines < 1) {
            throw new IllegalArgumentException(MachineShopSimulator.NUMBER_OF_MACHINES_MUST_BE_AT_LEAST_1);
        }
        finishTime = new int[theNumMachines + 1];

        // all machines are idle, initialize with
        // large finish time
        for (int i = 1; i <= theNumMachines; i++) {
            getFinishTime()[i] = theLargeTime;
        }
    }

    /** @return machine for next event */
    int nextEventMachine() {
        // find first machine to finish, this is the
        // machine with smallest finish time
        int p = 1;
        int t = getFinishTime()[1];
        for (int i = 2; i < getFinishTime().length; i++)
            if (getFinishTime()[i] < t) {// i finishes earlier
                p = i;
                t = getFinishTime()[i];
            }
        return p;
    }

    public int nextEventTime(int theMachine) {
        return getFinishTime()[theMachine];
    }

    public void setFinishTime(int theMachine, int theTime) {
        finishTime[theMachine] = theTime;
    }

    public int[] getFinishTime() {
        return finishTime;
    }
}
