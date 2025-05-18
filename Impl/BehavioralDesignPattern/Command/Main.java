package BehavioralDesignPattern.Command;

// SOLOID principles:
// Single Responsibility:Each command encapsulates one action.
// Open/Closed:New commands can be added without altering existing code.

// assemble simple commands int one complex 

public class Main {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        // same method could execute diffrenet objects
        
        invoker.execute(new CopyCommand());
        invoker.execute(new PasteCommand());
        invoker.execute(new CutCommand());
    }
}
