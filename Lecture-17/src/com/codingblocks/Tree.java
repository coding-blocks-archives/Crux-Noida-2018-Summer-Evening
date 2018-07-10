package com.codingblocks;

import java.util.ArrayList;
import java.util.Scanner;

public class Tree {

    private Node root;

    public void populate(){
        System.out.println("Enter value for root node ");
        Scanner scanner = new Scanner("20 2 10 3 2 0 5 0 11 0 6 1 3 0");
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

    public void display(){
        display(root, "");
    }

    private void display(Node node, String indent) {
        System.out.println(indent + node.value);

        if (node.children.size() > 0){
            for (int i = 0; i < node.children.size(); i++) {
                display(node.children.get(i), indent + "\t");
            }
        }
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
