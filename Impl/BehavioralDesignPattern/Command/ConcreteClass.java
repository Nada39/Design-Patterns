package BehavioralDesignPattern.Command;


// any concrete class implement Command (seberate the functionality from execution)
public class ConcreteClass implements Command {

    String name ;

    @Override
    public void execute() {
           name = "Nada";
    }

    
}