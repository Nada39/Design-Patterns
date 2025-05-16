package BehavioralDesignPattern.Mediator;

public interface AirCraft {
    void notify(String message);
    void requestLanding();
    void notifySuccess();
}