package com.codingblocks;

import java.util.ArrayList;
import java.util.LinkedList;

public class MapUsingArray<K, V> extends Object{

    private ArrayList<Node> list = new ArrayList<>();

    public MapUsingArray(){
        for (int i = 0; i < 100; i++) {
            list.add(null);
        }
    }

    public V get(K key){
        int location = key.hashCode() % list.size();

        if (list.get(location) == null){
            return null;
        }

        return list.get(location).value;
    }

    public void put(K key, V value){
        int location = key.hashCode() % list.size();
        list.set(location, new Node(key, value));
    }

    public void remove(K key){
        int location = key.hashCode() % list.size();
        list.set(location, null);
    }

    public boolean contains(K key){
        int location = key.hashCode() % list.size();
        return list.get(location) != null;
    }

    private class Node {
        private K key;
        private V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
