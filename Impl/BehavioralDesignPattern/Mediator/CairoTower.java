package BehavioralDesignPattern.Mediator;

import java.util.ArrayList;
import java.util.List;

public class CairoTower implements AirPortTower{

    List<AirCraft> registeredAirCrafts = new ArrayList<>();
    boolean isTerminalEmpty = true;

    @Override
    public void registerAirCraft(AirCraft airCraft) {
        registeredAirCrafts.add(airCraft);
        System.out.println(airCraft + " Registerd Succesfully");
    }

    @Override
    public void requestLanding(AirCraft airCraft) {

        if(isTerminalEmpty)
        {
            airCraft.notify(airCraft + " will land");

            registeredAirCrafts.forEach(ac -> {
                if(!ac.equals(airCraft))
                    ac.notify("from Cairo AirPortTower : there is an aircraft will land soon");
            });
        }
        else
        {
            System.out.println("the terminal is busy");

        }
    }

    @Override
    public void notifySuccess() {
        for (AirCraft registeredAirCrafts : registeredAirCrafts) {
            registeredAirCrafts.notify("from Cairo AirPortTower : terminal is empty");   
        }
    }
    
}
