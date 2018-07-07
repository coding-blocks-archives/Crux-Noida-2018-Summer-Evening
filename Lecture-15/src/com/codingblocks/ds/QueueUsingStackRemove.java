package com.codingblocks.ds;

public class QueueUsingStackRemove extends DynamicQueue{

    private Stack first;
    private Stack second;

    public QueueUsingStackRemove(){
        first = new DynamicStack();
        second = new DynamicStack();
    }

    @Override
    public void insert(int item) throws Exception {
        while (!first.isEmpty()){
            second.push(first.pop());
        }

        first.push(item);

        while (!second.isEmpty()){
            first.push(second.pop());
        }
    }

    @Override
    public int remove() throws Exception {
        return first.pop();
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
