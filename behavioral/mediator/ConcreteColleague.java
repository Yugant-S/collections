class Airplane extends Aircraft {

    public Airplane(AirTrafficControlMediator mediator, String name) {
        super(mediator, name);
    }

    public void send(String message) {
        System.out.println(name + " sends message: " + message);
        mediator.sendMessage(message, this);
    }

    public void receive(String message) {
        System.out.println(name + " received message: " + message);
    }
}
