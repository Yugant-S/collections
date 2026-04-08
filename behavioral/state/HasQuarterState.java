public class HasQuarterState implements State {

    GumballMachine machine;

    public HasQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    public void insertQuarter() {
        System.out.println("Quarter already inserted");
    }

    public void ejectQuarter() {

        System.out.println("Quarter returned");

        machine.setState(machine.getNoQuarterState());
    }

    public void turnCrank() {

        System.out.println("Crank turned");

        machine.setState(machine.getSoldState());
    }

    public void dispense() {
        System.out.println("Turn crank first");
    }
}
