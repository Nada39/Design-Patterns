package StructuralDesignPattern.Bridge;

public class Radio implements Device {
    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void enable() {
        System.out.println("Radio turn On");
    }

    @Override
    public void disable() {
        System.out.println("Radio turn Off");
    }
    
}
