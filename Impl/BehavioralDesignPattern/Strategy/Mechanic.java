package BehavioralDesignPattern.Strategy;


//Context
public class Mechanic {
    private Algortihm algortihm;

    public void setAlgortihm(Algortihm algortihm) {
        this.algortihm = algortihm;
    }

    public void disassembleCar()
    {
        // will perform algo based on the algorithm used(Strategy)
        algortihm.performAlgorithm();
    }
}
