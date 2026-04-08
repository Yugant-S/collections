// Concrete Colleague
class Sprinkler implements Component {

    private HomeMediator mediator;

    @Override
    public void setMediator(HomeMediator mediator) {
        this.mediator = mediator;
    }

    public void onEvent() {
        System.out.println("Sprinkler: Sprinkler running.");
        mediator.notify(this, "sprinklerOn");
    }

    public void turnOff() {
        System.out.println("Sprinkler: Turning off before scheduled shower.");
    }
}