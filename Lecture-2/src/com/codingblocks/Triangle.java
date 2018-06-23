package com.codingblocks;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int i = 0;

        int t = 1;

        while (i < n){

            int j = 0;

            while (j <= i){
                System.out.print(t + "\t");
                t = t + 1;
                j = j + 1;
            }

            i = i + 1;

            System.out.println();
        }
    }
}
