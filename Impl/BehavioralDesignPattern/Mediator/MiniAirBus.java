package BehavioralDesignPattern.Mediator;


// type of Aircraft
public class MiniAirBus implements AirCraft{
 
    private AirPortTower airPortTower;

    void setAirPortTower(AirPortTower airPortTower)
    {
        this.airPortTower = airPortTower;
    }

    @Override
    public void notify(String message) {
        System.out.println("this message: "+message + "from MiniAirBus");
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
