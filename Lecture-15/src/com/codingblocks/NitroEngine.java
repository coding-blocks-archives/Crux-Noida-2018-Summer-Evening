package com.codingblocks;

public class NitroEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starting Nitro engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Nitro engine");
    }

    @Override
    public void setTorque(int torque) {
        System.out.println("Setting nitro torque to " + torque);
    }
}
