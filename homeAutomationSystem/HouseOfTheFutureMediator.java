// Concrete Mediator
class HouseOfTheFutureMediator implements HomeMediator {

    private Alarm alarm;
    private CoffeeMachine coffeePot;
    private Calendar calendar;
    private Sprinkler sprinkler;

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public void setCoffeePot(CoffeeMachine coffeePot) {
        this.coffeePot = coffeePot;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public void setSprinkler(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }

    @Override
    public void notify(Component sender, String event) {

        // Coffee Rule
        if (event.equals("alarmOn")) {

            if (!calendar.isWeekend()) {
                coffeePot.startCoffee();
            }

            // Trash Day Rule
            if (calendar.isTrashDay()) {
                alarm.setEarlyAlarm();
            }
        }

        // Sprinkler Rule
        if (event.equals("sprinklerOn")) {

            if (calendar.isShowerScheduled()) {
                sprinkler.turnOff();
            }
        }
    }
}