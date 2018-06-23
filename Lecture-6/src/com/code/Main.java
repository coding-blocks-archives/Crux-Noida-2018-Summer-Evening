package com.code;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        printInc(5);

//        fibo(5);

        int[] nums = {12, 23, 12, 67, 12};

        System.out.println(findAllIndex(0, nums, 67));

    }

    public static void printDec(int n){

        if (n == -1){
            return;
        }

        System.out.println(n);

        printDec(n-1);
    }

    public static void printInc(int n){

        if (n == -1){
            return;
        }

        System.out.println(n);

        printInc(n-1);
    }

    public static void printIncDec(int n){

        if (n == -1){
            return;
        }

        System.out.println(n); // while entering in stack

        printInc(n-1);

        System.out.println(n); // while leaving from stack
    }

    public static int fact(int n){

        if (n == 0){
            return 1;
        }

        int t = n * fact(n-1);

        return t;
    }

    public static int fibo(int n){

        if (n == 0 || n == 1){
            return n;
        }

        int t =  fibo(n-1) + fibo(n-2);

        return t;
    }

    public static boolean sorted(int start, int[] nums){

        if (start == nums.length - 1){
            return true;
        }

        return nums[start] <= nums[start+1] &&
                sorted(start+1, nums);
    }

    public static boolean find(int start, int[] nums, int item){

        if (start == nums.length){
            return false;
        }

        return nums[start] == item ||
                find(start+1, nums, item);
    }

    public static int findIndex(int start, int[] nums, int item){

        if (start == nums.length){
            return -1;
        }

        if (nums[start] == item){
            return start;
        }

        return findIndex(start+1, nums, item);
    }

    public static ArrayList findAllIndex(int start, int[] nums, int item){

        // {12, 23, 34, 12, 67, 89, 12};

        if (start == nums.length){
            return new ArrayList();
        }

        ArrayList list = findAllIndex(start+1, nums, item);

        if (nums[start] == item){
            list.add(start);
        }

        return list;
    }

}
