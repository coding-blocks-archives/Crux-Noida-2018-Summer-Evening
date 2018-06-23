package com.codingblocks;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int i = 0;

        while (i < n){

            int j = 0;

            while (j < n){
                System.out.print("*");
                j = j + 1;
            }

            i = i + 1;

            System.out.println();
        }
    }
}
