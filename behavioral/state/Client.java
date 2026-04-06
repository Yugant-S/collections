public class GumballTest {

    public static void main(String[] args) {

        GumballMachine machine = new GumballMachine(2);

        machine.insertQuarter();

        machine.turnCrank();

        machine.insertQuarter();

        machine.ejectQuarter();

        machine.insertQuarter();

        machine.turnCrank();

        machine.insertQuarter();

        machine.turnCrank();
    }
}
