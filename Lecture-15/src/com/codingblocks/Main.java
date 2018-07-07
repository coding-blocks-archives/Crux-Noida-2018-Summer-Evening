package com.codingblocks;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Engine engine = new PetrolEngine();

        ModifiedCar car = new ModifiedCar(engine);

        car.start();
        car.stop();

        Engine modern = new NitroEngine();

        car.upgradeEngine(modern);

        car.start();
        car.stop();


    }
}
