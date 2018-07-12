package com.codingblocks;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinaryTree tree = new BinaryTree();
        tree.populate();
//
//        int[] pre = {12, 6, 23, 40, 21, 13};
//
//        int[] in = {23, 6, 21, 40, 12, 13};
//
////        tree.getTreeFromPreIn(pre, in);

//        tree.display();

//        System.out.println(tree.diameter());
//
//        BinaryTree.Node node = tree.find(40);
//
//        System.out.println(tree.height(node));
//
//        System.out.println(node.getValue());

//        tree.orders();

        System.out.println(tree.isBST());
    }
}
