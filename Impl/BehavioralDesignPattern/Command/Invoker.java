package BehavioralDesignPattern.Command;

public class Invoker {
    public void execute(Command command)
    {
        command.execute();
    }
}
