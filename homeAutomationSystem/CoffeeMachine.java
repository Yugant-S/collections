// Concrete Colleague
class CoffeeMachine implements Component {

    private HomeMediator mediator;

    @Override
    public void setMediator(HomeMediator mediator) {
        this.mediator = mediator;
    }

    public void startCoffee() {
        System.out.println("CoffeePot: Starting coffee brewing.");
    }
}