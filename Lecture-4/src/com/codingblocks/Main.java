package com.codingblocks;

public class Main {

    public static void main(String[] args) {

//        int[] nums1 = new int[10];

//        nums1 = new int[5];
//
//        int[] nums2 = nums1;
//
//        System.out.println(nums1);
//        System.out.println(nums2);
//
//
//
//        System.out.println(nums1);
//        System.out.println(nums2);\


        int[] nums = {345, 354, 546, 86};

        System.out.println(nums[0]);

        nums[0] = nums[1] + 1;

        System.out.println(nums[0]);

        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;

        System.out.println(nums[0] + " " + nums[1]);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        Utils.swap(nums, 0, 2);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }


}
