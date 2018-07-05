package com.codingblocks;

public class Human {
    private static int balance;
    private int eyes;

//    public static int giveCharity(){
//        balance = balance - 1000;
//        System.out.println("Yaar ab bas rah gye " + balance);
//
//        return 1000;
//    }

    public Human(){
        this.balance = 10000;
    }

    public Human(int balance) {
        this.balance = balance;
    }


    public int giveCharity(){

        int balance = 10;
//
        this.balance = this.balance - 1000;
        System.out.println("Yaar ab bas rah gye " + this.balance);
        cry();



        return 1000;
    }

    private void cry(){
        System.out.println("Sala 1000 le gya");
    }

    public static void main(String[] args) {
        Human human = new Human();
    }

}
