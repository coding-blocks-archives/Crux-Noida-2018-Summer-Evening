package com.codingblocks.ds;

public class StackClient {
    public static void main(String[] args) throws Exception{
        Stack stack = new Stack();

//        try {

            stack.push(234);
            stack.push(546);
            stack.push(76);
            stack.push(26534);
            stack.push(65);
            stack.push(8765);

            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());

//        } catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }
    }
}
