package BehavioralDesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    
    List<Observer> Observers = new ArrayList<>();
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void join(Observer observer)
    {
        this.Observers.add(observer);
    }

    public void remove(Observer observer)
    {
        this.Observers.remove(observer);
    }

    public void notifySuccess()
    {
        this.Observers.forEach(ob ->{
            ob.update();
        });
    }

}
