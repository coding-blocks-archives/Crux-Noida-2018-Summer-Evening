package com.codingblocks;

public class Fibo {

    public static void main(String[] args) {

        int num = 1;
        int[] mem = new int[num + 1];

        System.out.println(fiboItr(4));
    }


    public static int fiboItr(int num){
        int[] mem = new int[num + 1];

        mem[0] = 0;
        mem[1] = 1;

        for (int i = 2; i <= num; i++) {
            mem[i] = mem[i-1] + mem[i-2];
        }

        return mem[num];

    }


    public static int fibo(int num){

        if (num <= 1){
            return num;
        }

        return fibo(num-1) + fibo(num-2);

    }

    public static int fiboDP(int num, int[] mem){

        if (num <= 1){
            return num;
        }

        if (mem[num] != 0){
            return mem[num];
        }

        mem[num] = fiboDP(num-1, mem) + fiboDP(num-2, mem);

        return mem[num];

    }
}
