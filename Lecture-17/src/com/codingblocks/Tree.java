package com.codingblocks;

import java.util.*;

public class Tree {

    private Node root;

    public void populate() {
        System.out.println("Enter value for root node ");
        Scanner scanner = new Scanner("2 2 10 3 2 0 5 0 11 0 6 1 3 0");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(root, scanner);
    }

    private void populate(Node node, Scanner scanner) {

        System.out.println("How many children for " + node.value);
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.printf("Enter value of %d th child of %d ", i, node.value);
            int value = scanner.nextInt();
            Node child = new Node(value);
            node.children.add(child);
            child.parent = node;
            populate(child, scanner);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        System.out.println(indent + node.value);

        for (int i = 0; i < node.children.size(); i++) {
            display(node.children.get(i), indent + "\t");
        }
    }

    public void levelOrder(){
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()){
            Node node = queue.remove();
            System.out.println(node.value);
            for (int i = 0; i < node.children.size(); i++) {
                queue.add(node.children.get(i));
            }
        }
    }

    public void preOrder(){

        Stack<Node> stack = new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()){
            Node node = stack.pop();
            System.out.println(node.value);
            for (int i = node.children.size() - 1; i >= 0 ; i--) {
                stack.add(node.children.get(i));
            }
        }
    }

    private int maxSum(Node node) {

        int sum = node.value;

        for (int i = 0; i < node.children.size(); i++) {
            sum += node.children.get(i).value;
        }

        for (int i = 0; i < node.children.size(); i++) {
            sum = Math.max(sum, maxSum(node.children.get(i)));
        }

        return sum;
    }

    public void depthItems(int target) {
        depthItems(root, 0, target);
    }

    private void depthItems(Node node, int depth, int target) {
        if (depth == target) {
            System.out.println(node.value);
            return;
        }

        for (int i = 0; i < node.children.size(); i++) {
            depthItems(node.children.get(i), depth + 1, target);
        }
    }

    private void greaterItems(Node node, int target) {
        if (node.value > target) {
            System.out.println(node.value);
        }

        for (int i = 0; i < node.children.size(); i++) {
            greaterItems(node.children.get(i), target);
        }
    }

    public int count() {
        return count(root);
    }

    private int count(Node node) {

        int sum = 1;

        if (node.children.size() > 0) {
            for (int i = 0; i < node.children.size(); i++) {
                sum += count(node.children.get(i));
            }
        }

        return sum;
    }

    public int max() {
        return max(root);
    }

    private int max(Node node) {

        int max = node.value;

        for (int i = 0; i < node.children.size(); i++) {
            max = Math.max(max, max(node.children.get(i)));
        }

        return max;
    }

    private int degree(Node node) {

        int deg = node.children.size();

        for (int i = 0; i < node.children.size(); i++) {
            deg = Math.max(deg, degree(node.children.get(i)));
        }

        return deg;
    }

    private int depth(Node node) {

        if (node.children.size() == 0) {
            return 0;
        }

        int dep = 0;

        for (int i = 0; i < node.children.size(); i++) {
            dep = Math.max(dep, depth(node.children.get(i)));
        }

        return dep + 1;
    }

    private class Node {
        private int value;
        private ArrayList<Node> children;

        private Node parent;


        public Node(int value) {
            this.value = value;
            children = new ArrayList<>();
        }
    }
}
