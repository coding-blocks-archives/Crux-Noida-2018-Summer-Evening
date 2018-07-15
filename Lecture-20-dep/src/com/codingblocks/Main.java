package com.codingblocks;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        MapUsingArray<String, String> map = new MapUsingArray<>();

        map.put("apple", "a sweet red fruit");
        map.put("mango", "king of fruits");


        map.put("mango", "king of fruits till last year");

//        map.remove("apple");

        String val = map.get("mango");

        System.out.println("apple".hashCode());
    }
}
