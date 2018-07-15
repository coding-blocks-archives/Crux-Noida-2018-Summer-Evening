package com.codingblocks;

import java.util.ArrayList;
import java.util.LinkedList;

public class MapUsingHT<K, V> extends Object{

    private ArrayList<LinkedList<Node>> list = new ArrayList<>();

    private int size;

    private float loadFactor = 2;

    public MapUsingHT(){
        for (int i = 0; i < 100; i++) {
            list.add(new LinkedList<>());
        }

        size = 0;
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
        size++;

        float load = size / (float) list.size();

        if (load > loadFactor){
            rehash();
        }
    }

    private void rehash() {
        ArrayList<LinkedList<Node>> prev = list;

        this.list = new ArrayList<>();

        for (int i = 0; i < prev.size() * 2; i++) {
            list.add(new LinkedList<>());
        }

        size = 0;

        for (LinkedList<Node> nodes : prev ) {
            for (Node node : nodes){
                put(node.key, node.value);
            }
        }

//        for (int i = 0; i < prev.size(); i++) {
//            LinkedList<Node> nodes = prev.get(i);
//
//            for (int j = 0; j < nodes.size(); j++) {
//                Node node = nodes.get(j);
//
//                put(node.key, node.value);
//            }
//        }
    }

    public void remove(K key){
        int location = key.hashCode() % list.size();

        for (Node node : list.get(location)){
            if (node.key.equals(key)){
                list.get(location).remove(node);
                size--;
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

    public boolean isEmpty(){
        return size == 0;
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
