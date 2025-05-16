package StructuralDesignPattern.Bridge;

// the Impl must be selected or switched at run-time


// SOLID principles:
// Single Responsibility
// Open/Closed: Allows new implementations
// Dependency Inversion: Separates abstraction and implementation layers, reducing tight coupling

public class Main {
    public static void main(String[] args) {
        // based on kind of device the remote will execute
        Tv tv = new Tv();
        RemoteControl remoteControl = new RemoteControl(tv);
        remoteControl.togglePower();
    }
}
