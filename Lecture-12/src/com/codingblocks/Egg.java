package com.codingblocks;

public class Egg {

    public static void main(String[] args) {
        System.out.println(eggDrop(2, 5));
    }

    public static int eggDrop(int egg, int floor){
        if (floor == 0){
            return 0;
        }

        if (egg == 0){
            return Integer.MAX_VALUE;
        }

        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= floor ; i++) {
            int b = eggDrop(egg - 1, i-1);
            int u = eggDrop(egg, floor - i);

            int sol = 1 + Math.max(b, u);

            if (sol < min){
                min = sol;
            }
        }

        return min;
    }
}
