package com.codingblocks;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        MapUsingList<String, String> map = new MapUsingList<>();

        map.put("apple", "a sweet red fruit");
        map.put("mango", "king of fruits");


        map.put("mango", "king of fruits till last year");

        map.remove("apple");

        String val = map.get("apple");

        System.out.println(val);
    }
}
