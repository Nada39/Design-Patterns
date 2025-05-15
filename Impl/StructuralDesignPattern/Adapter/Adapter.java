package StructuralDesignPattern.Adapter;

public class Adapter implements Target  {
    Adaptee adaptee;

    @Override
    public void request() {
        adaptee.specificRequest();
    }
    
}
