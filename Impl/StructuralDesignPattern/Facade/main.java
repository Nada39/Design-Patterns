package StructuralDesignPattern.Facade;

// instead of client call each method in main, we gathered them so client call one method
// Weak coupling 

//SOLID principles:
//Single Responsibility: Provides a simplified interface while hiding complex subsystem interactions.
//Dependency Inversion: Ensures high-level modules interact only with abstractions instead of specific implementations.


//A facade can become a all-knowing (references a large number of distinct types, has too many unrelated or uncategorized methods, or some combination of both)
//object coupled to all classes of an app.

public class Main {
    public static void main(String[] args) {

        // from facade -> call the complex method
        Facade p = new Pizza();
        p.makePizza();
    }
}
