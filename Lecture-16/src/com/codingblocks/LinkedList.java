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
        if (size == 0){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size++;
    }

    public void insert(int value, int index){
        if (index == 0){
            insertFirst(value);
            return;
        }
        if (index == size){
            insertLast(value);
            return;
        }

        Node prev = get(index - 1);
        Node next = prev.next;

        Node node = new Node(value, next);
        prev.next = node;

        size++;

    }

    public Node get(int index){
        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public void set(int value, int index){
        get(index).value = value;
    }


    public void display(){
        Node node = head;

        while (node != null){
            System.out.print(node.value + "->");
            node = node.next;
        }
        System.out.println("END");
    }

    public int deleteFirst() throws Exception{
        if (size == 0){
            throw new Exception("Deleting from empty List");
        }

        int temp = head.value;
        head = head.next;

        if (head == null){
            tail = null;
        }

        size--;
        return temp;
    }

    public int deleteLast() throws Exception{
        if (size <= 1){
            return deleteFirst();
        }

        int temp = tail.value;

        Node node = head;

        while (node.next != tail){
            node = node.next;
        }

        tail = node;        // point tail at second last
        tail.next = null;   // deref the last node

        size--;
        return temp;
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
