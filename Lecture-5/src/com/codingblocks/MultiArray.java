package com.codingblocks;

public class MultiArray {
    public static void main(String[] args) {

        int[][] twod = new int[5][];

        for (int i = 0; i < twod.length; i++) {
            System.out.println(twod[i]);
        }

        for (int i = 0; i < twod.length; i++) {
            twod[i] = new int[i + 1];
        }

        for (int i = 0; i < twod.length; i++) {
            System.out.println(twod[i].length);
        }

        twod[0][0] = twod[1][0] + 3;


    }
}
