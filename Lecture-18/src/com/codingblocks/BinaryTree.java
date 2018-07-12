package com.codingblocks;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class BinaryTree {

    private Node root;

    public void populate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of root node ");
        int value = scanner.nextInt();

        root = new Node(value);

        populate(root, scanner);
    }

    // 12 true 6 true 23 false false true 40 true 21 false false false true 13 false false

    private void populate(Node node, Scanner scanner) {
        System.out.println("Want to add left child of " + node.value);
        boolean left = scanner.nextBoolean();

        if (left){
            System.out.println("Enter left value of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(node.left, scanner);
        }

        System.out.println("Want to add right child of " + node.value);
        boolean right = scanner.nextBoolean();

        if (right){
            System.out.println("Enter right value of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(node.right, scanner);
        }
    }

    private class Node {

        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }
}
