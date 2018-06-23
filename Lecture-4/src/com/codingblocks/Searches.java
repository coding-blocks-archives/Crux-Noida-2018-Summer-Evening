package com.codingblocks;

public class Searches {

    public static void main(String[] args) {
        int[] nums = {456, 657, 897, 898};

        System.out.println(binarySearch(nums, 657));
        System.out.println(binarySearch(nums, 658));
    }

    public static int linearSearch(int[] nums, int item){

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == item){
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] nums, int item){

        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int mid = (left + right)/2;

            if (nums[mid] == item){
                return mid;
            }
            else {
                if (nums[mid] < item){
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
