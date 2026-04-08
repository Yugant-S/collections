public class ATCMain {

    public static void main(String[] args) {

        AirTrafficControlMediator atc = new ATCTower();

        Aircraft plane1 = new Airplane(atc, "Flight A");
        Aircraft plane2 = new Airplane(atc, "Flight B");
        Aircraft plane3 = new Airplane(atc, "Flight C");

        atc.registerAircraft(plane1);
        atc.registerAircraft(plane2);
        atc.registerAircraft(plane3);

        plane1.send("Requesting permission to land.");
        plane2.send("Runway occupied. Please wait.");
    }
}
