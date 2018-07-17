package com.codingblocks;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityExample {
    public static void main(String[] args) {

        PriorityQueue<Human> queue = new PriorityQueue<>();

        queue.add(new Human(23, "Anuj"));
        queue.add(new Human(20, "Gaurav"));
        queue.add(new Human(28, "Mohit"));
        queue.add(new Human(18, "Bharat"));

        while (!queue.isEmpty()){
            System.out.println(queue.remove().toString());
        }

//        int[] nums = new int[10];
//
//        Arrays.toString(nums);

    }
}
