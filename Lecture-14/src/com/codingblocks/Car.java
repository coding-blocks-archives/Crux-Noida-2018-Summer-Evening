package com.codingblocks;

 public class Car {

     public int seats;
     private int windows;

    private boolean turbo;

    public Car(){
        this.seats = 4;
        this.windows = 4;
    }

    public void start(){
        System.out.println("I am generic car starting");
    }

    public void stop(){
        System.out.println("I am generic car stopping");
    }

    public int getSeats() {
        return seats;
    }

    public int getWindows() {
        return windows;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setSeats(int seats) {

        if (seats > 3 && seats < 6) {
            this.seats = seats;
        }
    }

    public static void bing(){
        System.out.println("Method of Car");
    }

//    abstract public void honk();
}
