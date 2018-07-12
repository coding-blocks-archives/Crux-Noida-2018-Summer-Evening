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

    private void populate(Node node, Scanner scanner) {
        System.out.println("Want to add left child of " + node.value);
        boolean left = scanner.nextBoolean();

        if (left){
            System.out.println("Enter left value of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
        }

        System.out.println("Want to add right child of " + node.value);
        boolean right = scanner.nextBoolean();

        if (right){
            System.out.println("Enter right value of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
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
