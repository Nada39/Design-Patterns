package BehavioralDesignPattern.Command;

public class PasteCommand implements Command{

    @Override
    public void execute() {
        System.out.println("executing paste Command");
    }

    
}