// Concrete Colleague
class Alarm implements Component {

    private HomeMediator mediator;

    @Override
    public void setMediator(HomeMediator mediator) {
        this.mediator = mediator;
    }

    public void onEvent() {
        System.out.println("Alarm: Alarm triggered.");
        mediator.notify(this, "alarmOn");
    }

    public void setEarlyAlarm() {
        System.out.println("Alarm: Setting early alarm for trash day.");
    }
}