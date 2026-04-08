import java.util.ArrayList;
import java.util.List;

class ATCTower implements AirTrafficControlMediator {

    private List<Aircraft> aircraftList;

    public ATCTower() {
        aircraftList = new ArrayList<>();
    }

    public void registerAircraft(Aircraft aircraft) {
        aircraftList.add(aircraft);
    }

    public void sendMessage(String message, Aircraft sender) {
        for (Aircraft aircraft : aircraftList) {
            if (aircraft != sender) {
                aircraft.receive(message);
            }
        }
    }
}
