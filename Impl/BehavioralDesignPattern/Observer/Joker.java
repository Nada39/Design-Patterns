package BehavioralDesignPattern.Observer;

public class Joker extends Subject{

    private String state;

    public void setState(String state) {
        this.state = state;
        notifySuccess();
    }
    

    public String getState() {
        return state;
    }
}
