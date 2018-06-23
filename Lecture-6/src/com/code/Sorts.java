package com.code;

import java.util.Arrays;

public class Sorts {

    public static void main(String[] args) {
        int[] nums = {23, 67, 56, 34, 11};

        selection(nums,  nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }

    public static void bubble(int[] nums, int end){

        if (end == 0){
            return;
        }

        for (int i = 0; i < end; i++) {
            if (nums[i] > nums[i+1]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }

        bubble(nums, end - 1);
    }

    public static void bubbleRec(int[] nums, int start, int end){

        if (end == 0){
            return;
        }

        if (start == end){
            bubbleRec(nums, 0, end - 1);
            return;
        }

        if (nums[start] > nums[start+1]){
            int temp = nums[start];
            nums[start] = nums[start+1];
            nums[start+1] = temp;
        }

        bubbleRec(nums, start+1, end);


    }

    public static void selection(int[] nums, int end){

        if (end == 0){
            return;
        }

        int index = maxIndex(nums, 0, end);

        int temp = nums[index];
        nums[index] = nums[end];
        nums[end] = temp;

        selection(nums, end - 1);

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

    public static int maxIndexRec(int[] nums, int start, int end){

        if (start == end){
            return end;
        }

        int index = maxIndexRec(nums, start + 1, end);

        if (nums[index] > nums[start]){
            return index;
        } else {
            return start;
        }
    }

}
