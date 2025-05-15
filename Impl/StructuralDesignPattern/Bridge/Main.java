package StructuralDesignPattern.Bridge;

public class Main {
    public static void main(String[] args) {
        // based on kind of device the remote will execute
        Tv tv = new Tv();
        RemoteControl remoteControl = new RemoteControl(tv);
        remoteControl.togglePower();
    }
}
