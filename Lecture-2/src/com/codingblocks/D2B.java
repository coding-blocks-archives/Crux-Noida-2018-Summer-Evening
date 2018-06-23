package com.codingblocks;

import java.util.Scanner;

public class D2B {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int b = 0;
        int p = 1;

        while (n > 0){
            int r = n % 2;
            n = n/2;
            b = b + p * r;
            p = p * 10;
        }

        System.out.println(b);

    }
}
