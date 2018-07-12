package com.codingblocks;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

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

    public void mirror(){
        mirror(root);
    }

    private void mirror(Node node) {

        if (node == null){
            return;
        }

        Node temp = node.left;
        node.left = node.right;
        node.right = temp;

        mirror(node.left);
        mirror(node.right);

    }

    public void orders(){
        preOrder(root);
        System.out.println("--------------");
        postOrder(root);
        System.out.println("--------------");
        inOrder(root);
        System.out.println("--------------");
    }

    private void preOrder(Node node){
        if (node == null){
            return;
        }

        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    private void postOrder(Node node){
        if (node == null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);
    }

    private void inOrder(Node node){
        if (node == null){
            return;
        }

        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
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

        if (left != null){
            return left;
        }


        Node right = find(node.right, value);
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

    public void getTreeFromPreIn(int[] pre, int[] in){

        int r = pre[0];

        int index = find(in, r);

        int[] preLeft = Arrays.copyOfRange(pre, 1, index + 1);
        int[] preRight = Arrays.copyOfRange(pre, index + 1, pre.length);

        int[] inLeft = Arrays.copyOfRange(in, 0, index);
        int[] inRight = Arrays.copyOfRange(in, index + 1, in.length);

        root = new Node(r);

        root.left = getTreeFromPreInRec(preLeft, inLeft);
        root.right = getTreeFromPreInRec(preRight, inRight);

    }

    public Node getTreeFromPreInRec(int[] pre, int[] in){

        if (pre.length == 0){
            return null;
        }

        int r = pre[0];

        int index = find(in, r);

        int[] preLeft = Arrays.copyOfRange(pre, 1, index + 1);
        int[] preRight = Arrays.copyOfRange(pre, index + 1, pre.length);

        int[] inLeft = Arrays.copyOfRange(in, 0, index);
        int[] inRight = Arrays.copyOfRange(in, index + 1, in.length);

        Node node =  new Node(r);

        node.left = getTreeFromPreInRec(preLeft, inLeft);
        node.right = getTreeFromPreInRec(preRight, inRight);

        return node;

    }


    public static int find(int[] nums, int item){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == item){
                return i;
            }
        }
        return -1;
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
