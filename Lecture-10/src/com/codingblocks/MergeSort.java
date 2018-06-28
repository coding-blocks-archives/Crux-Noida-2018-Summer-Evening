package com.codingblocks;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {5, 1, 2, 6, 9, 3};

        int[] sorted = sort(nums);

        System.out.println(Arrays.toString(sorted));
    }

    private static int[] sort(int[] nums) {

        if (nums.length == 1){
            return nums;
        }

        int[] first = Arrays.copyOfRange(nums, 0, nums.length/2);
        int[] second = Arrays.copyOfRange(nums, nums.length/2, nums.length);

        first = sort(first);
        second = sort(second);

        return merge(first, second);

    }

    private static int[] merge(int[] first, int[] second) {

        int[] merged = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length){
            if (first[i]<=second[j]){
                merged[k] = first[i++];
            } else {
                merged[k] = second[j++];
            }
            k++;
        }

        while (i < first.length){
            merged[k++] = first[i++];
        }

        while (j < second.length){
            merged[k++] = second[j++];
        }

        return merged;
    }
}
