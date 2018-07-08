package com.codingblocks;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(int value){
        Node node = new Node(value, head);

        head = node; // resetting head to new node

        if (tail == null){ // tail is only null in case on size 0
            tail = head;
        }

        size++;

    }

    public void insertLast(int value){

    }



    public void display(){
        Node node = head;

        while (node != null){
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
