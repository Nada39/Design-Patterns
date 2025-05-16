package StructuralDesignPattern.Adapter;


// SOLID principles:
//Single resposibility
//Open/Closed: provide new types of adapters into the program without breaking the existing client code (Pros and Cons) 
//Liskov Substitution: Ensures that different implementations can replace one another without altering the system.
//Dependency Inversion: Decoupleing by using abstractions(interfaces).


// Complexity of code increase 

public class Main {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        Target target = new Adapter();


        // call request() witch call specificRequest()
        adapter.request();
        target.request();
    }
}
