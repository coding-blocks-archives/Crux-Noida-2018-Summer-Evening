package com.codingblocks;

public class Wave {
    public static void main(String[] args) {


        int[][] twod = {
                {1, 2, 3, 0},
                {4, 5, 6, 0},
                {7, 8, 9, 10}
        };

        display(twod);

        vertical(twod);


    }

    public static void vertical(int[][] twod){
        for (int j = 0; j < twod[0].length ; j++) {
            if (j%2 == 0){
                for (int i = 0; i < twod.length; i++) {
                    System.out.println(twod[i][j]);
                }

            } else {
                for (int i = twod.length - 1; i >= 0  ; i--) {
                    System.out.println(twod[i][j]);
                }
            }
        }
    }

    public static void horizontal(int[][] twod){
        for (int i = 0; i < twod.length ; i++) {
            if (i%2 ==0){
                for (int j = 0; j < twod[i].length; j++) {
                    System.out.println(twod[i][j]);
                }

            } else {
                for (int j = twod[i].length - 1; j >= 0  ; j--) {
                    System.out.println(twod[i][j]);
                }
            }
        }
    }

    public static void display(int[][] twod){
        for (int i = 0; i < twod.length; i++) {
            for (int j = 0; j < twod[i].length; j++) {
                System.out.print(twod[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void spiral(int[][] twod){
        int top = 0;
        int left = 0;
        int right = twod[0].length - 1;
        int bottom = twod.length - 1;

        while (top <= bottom && left <= right){
//            for (int i = 0; i < ; i++) {
//
//            }
        }
    }
}
