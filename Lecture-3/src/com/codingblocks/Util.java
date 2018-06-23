package com.codingblocks;

public class Util {

    public static void main(String[] args) {
//        int a = 21;
//        int b = 22;
//
//        System.out.println(a + " " + b);
//        swap(a, b);
//        System.out.println(a + " " + b);

        System.out.println(isArm(153));

        armList(100, 999);
    }

    public static void swap(int a, int b){
        int t = a;
        a = b;
        b = t;
    }

    public static boolean isArm(int num){
        int sum = 0;
        int copy = num;

        while (num > 0){
            int r = num % 10;
            num = num / 10;

            sum = sum + r*r*r;
            // write arm code here
        }

        return copy == sum;
    }

    public static void armList(int start, int end){
        for (int i = start; i <= end ; i++) {
            if (isArm(i)){
                System.out.println(i);
            }
        }
    }
}
