package com.codingblocks;

import java.util.PriorityQueue;

public class HeapClient {

    public static void main(String[] args) {
        GenericHeap<Human> queue = new GenericHeap<>();

        queue.insert(new Human(23, "Anuj"));
        queue.insert(new Human(20, "Gaurav"));
        queue.insert(new Human(28, "Mohit"));
        queue.insert(new Human(18, "Bharat"));

        while (!queue.isEmpty()){
            System.out.println(queue.remove().toString());
        }
    }
}
