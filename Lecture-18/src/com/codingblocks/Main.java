package com.codingblocks;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinaryTree tree = new BinaryTree();
        tree.populate();

//        tree.display();

        System.out.println(tree.diameter());

        BinaryTree.Node node = tree.find(40);

        System.out.println(tree.height(node));

        System.out.println(node.getValue());
    }
}
