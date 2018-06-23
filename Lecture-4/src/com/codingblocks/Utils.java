package com.codingblocks;

import java.util.Scanner;

public class Utils {

    public static void main(String[] args) {

        int[] nums = createArray(4);

        display(nums);

    }

    public static int[] createArray(int size){
        int[] nums = new int[size];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter value " + i + " : ");
            nums[i] = s.nextInt();
        }

        return nums;
    }

    public static void display(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println("END");
    }

    public static void swap(int[] nums, int x, int y){

        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public static int maxIndex(int[] nums){
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[max] < nums[i]){
                max = i;
            }
        }

        return max;
    }

    public static int maxIndex(int[] nums, int start, int end){
        int max = start;

        for (int i = start; i <= end; i++) {
            if (nums[max] < nums[i]){
                max = i;
            }
        }

        return max;
    }
}
