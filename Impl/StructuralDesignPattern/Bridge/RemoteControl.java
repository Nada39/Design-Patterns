package StructuralDesignPattern.Bridge;

public class RemoteControl {
    protected Device device;

    RemoteControl(Device device)
    {
        this.device = device;
    }

    public void togglePower() {
        if(device.isEnabled())
        {
            device.disable();
        }
        else
        {
            device.enable();
        }
    }
}
