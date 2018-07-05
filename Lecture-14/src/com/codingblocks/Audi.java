package com.codingblocks;

public class Audi extends Car {

    private int seats;
    private int windows;

    private boolean turbo;

    public String name;

    public Audi(){
        this.seats = 5;
        this.windows = 4;
    }

    public boolean abs;

    public void start(){
        System.out.println("This is fancy car starting");
    }

    public void start(boolean turbo){
        System.out.println("This is fancy car starting in a second");
    }

    public void applyABS(){
        System.out.println("Brake smoothly");
    }

    public void list_data(){
        System.out.println(this.seats);
        System.out.println(super.seats);

    }

    public static void bing(){
        System.out.println("Method of Audi");
    }

}
