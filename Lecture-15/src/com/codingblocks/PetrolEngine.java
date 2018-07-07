package com.codingblocks;

public class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starting petrol engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping petrol engine");
    }

    @Override
    public void setTorque(int torque) {
        System.out.println("Setting torque to " + torque);
    }
}
