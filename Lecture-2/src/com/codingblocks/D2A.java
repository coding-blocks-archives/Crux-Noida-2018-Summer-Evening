package com.codingblocks;

import java.util.Scanner;

public class D2A {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int k = s.nextInt();


        int b = 0;
        int p = 1;

        while (n > 0){
            int r = n % k;
            n = n/k;
            b = b + p * r;
            p = p * 10;
        }

        System.out.println(b);

        int j = 9;
        int e = 7;

        int c = e>8 ? j++ : e++;



    }
}
