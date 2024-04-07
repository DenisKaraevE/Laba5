package org.example.lab2.Bridge;

public class BridgeService {
    public void exec(String dev) {
        switch (dev)
        {
            case ("TV"):
                testDevice(new TV());
            case ("Radio"):
                testDevice(new Radio());
        }
    }

    private void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
