package com.codingblocks.ds;

public class QueueUsingStackInsert extends DynamicQueue{

    private Stack first;
    private Stack second;

    public QueueUsingStackInsert(){
        first = new DynamicStack();
        second = new DynamicStack();
    }

    @Override
    public void insert(int item) throws Exception {
        first.push(item);
    }

    @Override
    public int remove() throws Exception {
        while (!first.isEmpty()){
            second.push(first.pop());
        }

        int temp = second.pop();

        while (!second.isEmpty()){
            first.push(second.pop());
        }

        return temp;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return first.isEmpty();
    }
}
