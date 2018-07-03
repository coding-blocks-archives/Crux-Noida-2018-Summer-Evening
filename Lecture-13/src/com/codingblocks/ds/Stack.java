package com.codingblocks.ds;

public class Stack {

    private int top = -1;
    private int DEFAULT_SIZE = 5;
    private int[] data = new int[DEFAULT_SIZE];

    public boolean isFull(){
        return this.top == this.data.length - 1;
    }

    public boolean isEmpty(){
        return this.top ==  - 1;
    }

    public void push(int item) throws Exception{
        if (isFull()){
            throw new Exception("Stack is full");
        }

        this.data[++this.top] = item;
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is empty");
        }

        return this.data[this.top--];
    }

}
