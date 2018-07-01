package com.codingblocks;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int pow(int x, int n, int[] mem){
        if (n == 1){
            return x;
        }

        if (mem[n] != 0){
            return mem[n];
        }

        mem[n] =  pow(x, n/2, mem) * pow(x, n - n/2, mem);

        return mem[n];
    }
}
