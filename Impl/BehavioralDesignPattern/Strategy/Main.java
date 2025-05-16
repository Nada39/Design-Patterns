package BehavioralDesignPattern.Strategy;

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
