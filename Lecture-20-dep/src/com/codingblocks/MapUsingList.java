package com.codingblocks;

import java.util.LinkedList;

public class MapUsingList <K, V> extends Object{

    private LinkedList<Node> list = new LinkedList<>();

    public V get(K key){

        for (Node node : list) {
            if (node.key.equals(key)){
                return node.value;
            }
        }

        return null;
    }

    public void put(K key, V value){
        for (Node node : list) {
            if (node.key.equals(key)){
                node.value = value;
                return;
            }
        }

        list.add(new Node(key, value));
    }

    public void remove(K key){
        for (Node node : list) {
            if (node.key.equals(key)){
                list.remove(node);
                return;
            }
        }
    }

    public boolean contains(K key){
        for (Node node : list) {
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
