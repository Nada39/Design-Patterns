package BehavioralDesignPattern.Strategy;

// Client choose an algo 
// Client must be aware about all strategies to select it 

// SOLID priciples:
//Open/Closed: New strategies can be added.
//Single Responsibility: Each strategy encapsulates one algorithm.


public class Main {
    public static void main(String[] args) {
        Mechanic mechanic = new Mechanic();
        
        //One of algo(strategy)
        Toyota toyota = new Toyota();
        
        mechanic.setAlgortihm(toyota);
        mechanic.disassembleCar();

        //it another algo exist, set new algo and disassemle....

    }
    
}
