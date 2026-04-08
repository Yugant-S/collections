abstract class Aircraft {

    protected AirTrafficControlMediator mediator;
    protected String name;

    public Aircraft(AirTrafficControlMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    abstract void send(String message);
    abstract void receive(String message);
}
