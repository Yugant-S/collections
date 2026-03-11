class Car extends Vehicle {

    public Car(Workshop w1, Workshop w2) {
        super(w1, w2);
    }

    public void manufacture() {
        System.out.println("Car manufacturing process:");
        workshop1.work();
        workshop2.work();
    }
}