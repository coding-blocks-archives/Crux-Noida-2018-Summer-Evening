package com.codingblocks;

public class ModifiedCar {

    private PetrolEngine engine;

    public ModifiedCar(){
        this.engine = new PetrolEngine();
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }
}
