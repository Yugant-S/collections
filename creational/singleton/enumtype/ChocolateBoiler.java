package creational.singleton.enumtype;

public enum ChocolateBoiler {

    INSTANCE;

    private boolean empty;
    private boolean boiled;

    ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public void fill() {
        if (empty) {
            empty = false;
            boiled = false;
            System.out.println("Boiler filled.");
        }
    }

    public void boil() {
        if (!empty && !boiled) {
            boiled = true;
            System.out.println("Boiler boiled.");
        }
    }

    public void drain() {
        if (!empty && boiled) {
            empty = true;
            System.out.println("Boiler drained.");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
