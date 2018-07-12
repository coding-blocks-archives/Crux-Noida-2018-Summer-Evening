package com.codingblocks;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class BinaryTree {

    private Node root;

    public void populate(){
        Scanner scanner = new Scanner("12 true 6 true 23 false false true 40 true 21 false false false true 13 false false");
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

    public void display(){
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null){
            return;
        }

        System.out.println(indent + node.value);

        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public boolean exists(int value){
        return exists(root, value);
    }

    private boolean exists(Node node, int value) {
        if (node == null){
            return false;
        }

        if (node.value == value){
            return true;
        }

        return exists(node.left, value) || exists(node.right, value);
    }

    public Node find(int value){
        return find(root, value);
    }

    private Node find(Node node, int value) {
        if (node == null){
            return null;
        }

        if (node.value == value){
            return node;
        }

        Node left = find(node.left, value);
        Node right = find(node.right, value);

        if (left != null){
            return left;
        }

        if (right != null){
            return right;
        }

        return null;

    }

    public int diameter(){
        return height(root.left) + height(root.right) + 1;
    }

    public int height(Node node){
        if (node == null){
            return 0;
        }

        int left = height(node.left);
        int right = height(node.right);

        return Math.max(left, right) + 1;
    }


    public class Node {

        private int value;
        private Node left;
        private Node right;

        private Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
