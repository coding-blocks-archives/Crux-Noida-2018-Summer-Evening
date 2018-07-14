package com.codingblocks;

public class BinarySearchTree <T extends Comparable> {

    private Node root;

    public void populate(T[] values){
        populate(values, 0, values.length - 1);
    }

    private void populate(T[] values, int start, int end) {
        if (start > end){
            return;
        }

        int mid = (start + end) / 2;

        insert(values[mid]);
        populate(values, start, mid - 1);
        populate(values, mid + 1, end);
    }

    public void insert(T value){
        root = insert(root, value);
    }

    private Node insert(Node node, T value) {
        if (node == null){
            return new Node(value);
        }

        if (node.value.compareTo(value) > 0){
            node.left = insert(node.left, value);
        }

        if (node.value.compareTo(value) < 0){
            node.right = insert(node.right, value);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        if (balance(node) > 1){
            if (balance(node.left) > 0){
                return rightRotate(node);
            } else if (balance(node.left) < 0){
                node.left = leftRotation(node.left);
                return rightRotate(node);
            }
        }

        if (balance(node) < -1){
            if (balance(node.right) < 0){
                return leftRotation(node);
            } else if(balance(node.right) > 0){
                node.right = rightRotate(node.right);
                return leftRotation(node);
            }
        }

        return node;
    }

    public int balance(Node node){
        return height(node.left) - height(node.right);
    }

    private Node rightRotate(Node x){

        // before swap
        Node y = x.left;
        Node T2 = y.right;

        // rotation
        y.right = x;
        x.left = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public Node leftRotation(Node y){
        // before rotation
        Node x = y.right;
        Node t2 = x.left;

        // rotation
        x.left = y;
        y.right = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;

    }

    private int height(Node node){
        if (node == null){
            return 0;
        }

        return node.height;
    }

    public void inorder(){
        inorder(root);
    }

    private void inorder(Node node){
        if (node == null){
            return;
        }

        inorder(node.left);
        System.out.println(node.value);
        inorder(node.right);
    }

    public void inrange(T k1, T k2){
        inrange(root, k1, k2);
    }

    private void inrange(Node node, T k1, T k2){
        if (node == null){
            return;
        }

        inrange(node.left, k1, k2);

        if (node.value.compareTo(k1) > 0 && node.value.compareTo(k2) < 0) {
            System.out.println(node.value);
        }

        inrange(node.right, k1, k2);
    }

//    private T successor(Node node, int target){
//        if (node == null){
//            return null;
//        }
//
//
//        inorder(node.left);
//
//        System.out.println(node.value);
//
//        inorder(node.right);
//    }

    public void display(){
        display(root, "", 0);
    }

    private void display(Node node, String indent, int location) {
        if (node == null){
            return;
        }

        String loc;

        if (location < 0){
            loc = " left";
        } else if (location > 0){
            loc = " right";
        } else {
            loc = " root";
        }

        System.out.println(indent + node.value + loc);

        display(node.left, indent + "\t", -1);
        display(node.right, indent + "\t", 1);
    }

    private class Node {

        private T value;
        private Node left;
        private Node right;
        private int height;

        public Node(T value) {
            this.value = value;

            this.height = 1;
        }
    }
}
