package StructuralDesignPattern.Adapter;

public class Adapter implements Target  {
    // it should be the class that implement adaptee
    Adaptee adaptee;

    @Override
    public void request() {
        System.out.println("Request");
        adaptee.specificRequest();
    }
    
}
