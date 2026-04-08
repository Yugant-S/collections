package creational.singleton.eager;

public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;

    private static final ChocolateBoiler instance = new ChocolateBoiler();

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        return instance;
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
