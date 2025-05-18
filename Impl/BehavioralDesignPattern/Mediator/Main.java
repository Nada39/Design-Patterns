package BehavioralDesignPattern.Mediator;

// SOLID principles:
// Dependency Inversion: Objects depend on the mediator instead of each other.
// Single Responsibility: Mediator handles communication separately.

// Decoupling between objects
// Communication management

public class Main {
    public static void main(String[] args) {
        CairoTower cairoTower = new CairoTower();

        AirBus airBus = new AirBus();
        MiniAirBus miniAirBus = new MiniAirBus();


        // set AirPortTower for each Aircraft
        airBus.setAirPortTower(cairoTower);
        miniAirBus.setAirPortTower(cairoTower);

        airBus.requestLanding();
        miniAirBus.requestLanding();

        airBus.notifySuccess();

    }
}
