package com.codingblocks;

public class Human {
    private int balance = 10000;

    public int giveCharity(){
        balance = balance - 1000;
        System.out.println("Yaar ab bas rah gye " + balance);
        return 1000;
    }
}
