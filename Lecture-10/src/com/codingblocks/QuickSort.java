package com.codingblocks;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5, 1, 2, 6, 9, 3};

        sort(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));;
    }

    private static void sort(int[] nums, int start, int end) {

        if (start >= end){
            return;
        }

        int piv = end;

        piv = optPivot(nums, start, end, piv);

        sort(nums, start, piv - 1);
        sort(nums, piv + 1, end);
    }

    private static int optPivot(int[] nums, int start, int end, int piv) {

        int j = start;

        for (int i = start; i < piv; i++) {
            if (nums[i] < nums[piv]){
               swap(nums, i, j++);
            }
        }

        swap(nums, j, piv);
        return j;
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }


}
