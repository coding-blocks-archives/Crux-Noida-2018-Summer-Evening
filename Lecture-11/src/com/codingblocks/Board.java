package com.codingblocks;

public class Board {

    public static void main(String[] args) {
        System.out.println(diceItr(5));
    }

    public static int dice(int target){
        if (target == 0){
            return 1;
        }

        int count = 0;

        for (int i = 1; i <= 6 && i <= target ; i++) {
           count += dice(target - i);
        }

        return count;
    }

    public static int diceDP(int target, int[] mem){
        if (target == 0){
            return 1;
        }

        if (mem[target] != 0){
            return mem[target];
        }

        int count = 0;

        for (int i = 1; i <= 6 && i <= target ; i++) {
            count += dice(target - i);
        }

        mem[target] =  count;

        return mem[target];
    }

    public static int diceItr(int target){

        int[] mem = new int[target + 1];

        mem[0] = 1;

        for (int i = 1; i <= target ; i++) {
            int count = 0;
            for (int j = 1; j <= 3 && j <= i; j++) {
                count+=mem[i-j];
            }
            mem[i] = count;
        }

        return mem[target];

    }
}
