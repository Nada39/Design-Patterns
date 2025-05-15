package StructuralDesignPattern.Bridge;

public class Tv implements Device{

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void enable() {
        System.out.println("Tv turn On");
    }

    @Override
    public void disable() {
        System.out.println("Tv turn Off");
    }
    
}
