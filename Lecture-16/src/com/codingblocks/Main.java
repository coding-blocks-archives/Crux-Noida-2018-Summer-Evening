package com.codingblocks;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LinkedList list = new LinkedList();

        list.insertLast(4);
        list.insertFirst(10);
        list.insertFirst(40);
        list.insertFirst(50);

        list.insertLast(30);

        list.display();

        try {
            list.deleteFirst();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        list.display();
    }
}
