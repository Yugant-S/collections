public class SoldState implements State {

    GumballMachine machine;

    public SoldState(GumballMachine machine) {
        this.machine = machine;
    }

    public void insertQuarter() {
        System.out.println("Wait! dispensing gumball");
    }

    public void ejectQuarter() {
        System.out.println("Already turned crank");
    }

    public void turnCrank() {
        System.out.println("Turning twice not allowed");
    }

    public void dispense() {

        machine.releaseBall();

        if (machine.getCount() > 0) {

            machine.setState(machine.getNoQuarterState());

        } else {

            System.out.println("Machine empty");

            machine.setState(machine.getSoldOutState());
        }
    }
}
