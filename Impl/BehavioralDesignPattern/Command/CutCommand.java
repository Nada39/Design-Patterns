package BehavioralDesignPattern.Command;

public class CutCommand implements Command {

    @Override
    public void execute() {
        System.out.println("executing cut Command");

    }
    
}
