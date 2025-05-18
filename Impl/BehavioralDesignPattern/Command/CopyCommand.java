package BehavioralDesignPattern.Command;


// any concrete class implement Command (seberate the functionality from execution)
public class CopyCommand implements Command {


    @Override
    public void execute() {
        System.out.println("executing copy Command");
    }

    
}