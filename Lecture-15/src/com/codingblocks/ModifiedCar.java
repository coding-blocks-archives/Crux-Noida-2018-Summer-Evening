package com.codingblocks;

public class ModifiedCar {

    private Engine engine;

//    public ModifiedCar(){
//        this.engine = new PetrolEngine();
//    }

    public ModifiedCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void upgradeEngine(Engine engine){
        this.engine = engine;
    }
}
