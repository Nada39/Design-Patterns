package BehavioralDesignPattern.Mediator;


//type of airCraft
public class AirBus implements AirCraft{

    private AirPortTower airPortTower;

    void setAirPortTower(AirPortTower airPortTower)
    {
        this.airPortTower = airPortTower;
    }

    @Override
    public void notify(String message) {
        System.out.println("this message: "+message + "from Airbus");
    }

    @Override
    public void requestLanding() {
        airPortTower.requestLanding(this);
    }

    @Override
    public void notifySuccess() {
        airPortTower.notifySuccess();;
    }
    
}
