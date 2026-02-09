package creational.singleton.lazy;

public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler instance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (instance == null) {
            instance = new ChocolateBoiler();
        }
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
