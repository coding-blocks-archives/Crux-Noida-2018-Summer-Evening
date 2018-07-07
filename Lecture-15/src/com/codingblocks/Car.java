package com.codingblocks;

public class Car implements Engine, AirConditioner {

    @Override
    public void start() {
        System.out.println("Starting with low comfort");
    }

    @Override
    public void stop() {
        System.out.println("Stopping with low comfort");
    }

    @Override
    public void setTorque(int torque) {
        System.out.println("You are setting torque here to " + torque);
    }

}
