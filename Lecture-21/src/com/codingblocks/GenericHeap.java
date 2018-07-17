package com.codingblocks;

import java.util.ArrayList;

public class GenericHeap <T extends Comparable> {

    private ArrayList<T> items = new ArrayList<>();

    public boolean isEmpty(){
        return items.isEmpty();
    }

    public T peek(){
        return items.get(0);
    }

    public void insert(T data){
        items.add(data);
        int index = items.size() - 1;
        upheap(index);
    }

    private void upheap(int index) {
        if (index == 0){
            return;
        }

        int parent = parent(index);

        if (items.get(index).compareTo(items.get(parent))< 0){
            swap(parent, index);
            upheap(parent);
        }
    }

    public T remove(){
        T temp = items.get(0);

        T data = items.remove(items.size() - 1);

        if (!isEmpty()){
            items.set(0, data);
            downheap(0);
        }

        return temp;
    }

    private void downheap(int index) {

        int min = index;

        if (left(index) < items.size() && items.get(left(index)).compareTo(items.get(min)) < 0){
            min = left(index);
        }

        if (right(index) < items.size() && items.get(right(index)).compareTo(items.get(min)) < 0){
            min = right(index);
        }

        if (index != min){
            swap(index, min);
            downheap(min);
        }
    }

    private void swap(int first, int second) {
        T temp = items.get(first);
        items.set(first, items.get(second));
        items.set(second, temp);
    }

    public int left(int index){
        return 2 * index + 1;
    }

    public int right(int index){
        return 2 * index + 2;
    }

    public int parent(int index){
        return (index - 1) / 2;
    }
}
