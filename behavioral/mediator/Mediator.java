interface AirTrafficControlMediator {
    void registerAircraft(Aircraft aircraft);
    void sendMessage(String message, Aircraft aircraft);
}
