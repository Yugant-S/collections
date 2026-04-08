abstract class Vehicle {

    protected Workshop workshop1;
    protected Workshop workshop2;

    protected Vehicle(Workshop w1, Workshop w2) {
        this.workshop1 = w1;
        this.workshop2 = w2;
    }

    abstract void manufacture();
}