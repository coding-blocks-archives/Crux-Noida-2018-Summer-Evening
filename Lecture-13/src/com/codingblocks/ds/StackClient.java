package com.codingblocks.ds;

public class StackClient {
    public static void main(String[] args){
        Stack stack = new DynamicStack();

        try {

            for (int i = 0; i < 10000; i++) {
                stack.push((int)(Math.random()*1000));
            }


            while (!stack.isEmpty()){
                System.out.println(stack.pop());
            }

        } catch (Exception ex){
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("This will happen anyway");
        }

        System.out.println("This still works");
    }
}
