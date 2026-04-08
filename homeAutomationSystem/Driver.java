public class Driver {

    public static void main(String[] args) {

        HouseOfTheFutureMediator mediator =
                new HouseOfTheFutureMediator();

        Alarm alarm = new Alarm();
        CoffeeMachine coffeePot = new CoffeeMachine();

        Calendar calendar =
                new Calendar(false, true, true);

        Sprinkler sprinkler = new Sprinkler();

        alarm.setMediator(mediator);
        coffeePot.setMediator(mediator);
        calendar.setMediator(mediator);
        sprinkler.setMediator(mediator);

        mediator.setAlarm(alarm);
        mediator.setCoffeePot(coffeePot);
        mediator.setCalendar(calendar);
        mediator.setSprinkler(sprinkler);

        alarm.onEvent();

        sprinkler.onEvent();
    }
}