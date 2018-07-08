package com.codingblocks;

import java.util.Scanner;

public class Egg {

    public static void main(String[] args) {
        System.out.println(eggDrop(5, 5));
    }

    public static int eggDrop(int egg, int floor, int[][] mem){
        if (floor == 0){
            return 0;
        }

        if (egg == 1){
            return floor;
        }

        if (mem[egg][floor] != 0){
            return mem[egg][floor];
        }

        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= floor ; i++) {
            int b = eggDrop(egg - 1, i-1, mem);
            int u = eggDrop(egg, floor - i, mem);

            int sol = 1 + Math.max(b, u);

            if (sol < min){
                min = sol;
            }
        }

        mem[egg][floor] = min;

        return mem[egg][floor];
    }
}
