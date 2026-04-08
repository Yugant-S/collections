// Concrete Colleague
class Calendar implements Component {

    private HomeMediator mediator;

    private boolean weekend;
    private boolean trashDay;
    private boolean showerScheduled;

    public Calendar(boolean weekend,
                    boolean trashDay,
                    boolean showerScheduled) {

        this.weekend = weekend;
        this.trashDay = trashDay;
        this.showerScheduled = showerScheduled;
    }

    @Override
    public void setMediator(HomeMediator mediator) {
        this.mediator = mediator;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public boolean isTrashDay() {
        return trashDay;
    }

    public boolean isShowerScheduled() {
        return showerScheduled;
    }
}