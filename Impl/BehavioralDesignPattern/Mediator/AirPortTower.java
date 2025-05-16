package BehavioralDesignPattern.Mediator;

public interface AirPortTower {
    
    void registerAirCraft(AirCraft airCraft);
    void requestLanding(AirCraft airCraft);
    void notifySuccess();
}
