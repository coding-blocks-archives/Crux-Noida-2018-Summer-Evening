package com.codingblocks;

import java.util.ArrayList;
import java.util.LinkedList;

public class MapUsingHT<K, V> extends Object{

    private ArrayList<LinkedList<Node>> list = new ArrayList<>();

    public MapUsingHT(){
        for (int i = 0; i < 100; i++) {
            list.add(new LinkedList<>());
        }
    }

    public V get(K key){
        int location = key.hashCode() % list.size();

        for (Node node : list.get(location)){
            if (node.key.equals(key)){
                return node.value;
            }
        }

        return null;
    }

    public void put(K key, V value){
        int location = key.hashCode() % list.size();

        for (Node node : list.get(location)){
            if (node.key.equals(key)){
                node.value = value;
                return;
            }
        }

        list.get(location).add(new Node(key, value));
    }

    public void remove(K key){
        int location = key.hashCode() % list.size();

        for (Node node : list.get(location)){
            if (node.key.equals(key)){
                list.get(location).remove(node);
                return;
            }
        }
    }

    public boolean contains(K key){
        int location = key.hashCode() % list.size();

        for (Node node : list.get(location)){
            if (node.key.equals(key)){
                return true;
            }
        }

        return false;
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
