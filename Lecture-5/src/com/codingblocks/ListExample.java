package com.codingblocks;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(5);
        list.add(34);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.set(1, 42);


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

//        list.set(2, 56);

        System.out.println(list.size());


    }
}
