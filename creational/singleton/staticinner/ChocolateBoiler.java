package creational.singleton.staticinner;

public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    private static class Holder {
        private static final ChocolateBoiler INSTANCE = new ChocolateBoiler();
    }

    public static ChocolateBoiler getInstance() {
        return Holder.INSTANCE;
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
