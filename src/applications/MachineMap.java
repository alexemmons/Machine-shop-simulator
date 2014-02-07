package applications;

import java.util.HashMap;
import java.util.Map;

public class MachineMap {
    //data members
    private Map<Integer, Machine> machine = new HashMap<Integer, Machine>();

    // constructor
    public MachineMap() {
        machine = new HashMap<Integer, Machine>(); // array of machines
    }
    
    // methods
    public Machine getMachine(int i) {
        return machine.get(i);
    }
    public void setMachine(Integer i, Machine m) {
        machine.put(i, m);
    }
}
