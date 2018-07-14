package com.codingblocks;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        Integer[] nums = new Integer[10000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }

        tree.populate(nums);

//        tree.inrange(10, 20);

        tree.display();
    }
}
