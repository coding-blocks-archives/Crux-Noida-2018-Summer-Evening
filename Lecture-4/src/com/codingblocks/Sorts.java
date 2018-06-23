package com.codingblocks;

public class Sorts {

    public static void bubble(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j+1]){
                    Utils.swap(nums, j, j+1);
                }
            }
        }
    }

    public static void selection(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int max = Utils.maxIndex(nums, 0, nums.length - i - 1);
            Utils.swap(nums, max, nums.length - i - 1);
        }
    }

    public static void insertion(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if (nums[j] < nums[j-1]){
                    Utils.swap(nums, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
}
