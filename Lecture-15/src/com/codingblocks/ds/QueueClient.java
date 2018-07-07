package com.codingblocks.ds;

public class QueueClient {
    public static void main(String[] args){
        Queue queue = new QueueUsingStackRemove();

        try {

            for (int i = 0; i < 10; i++) {
                int item = (int)(Math.random()*1000);
                queue.insert(item);
                System.out.println("inserted " + item);
            }


            while (!queue.isEmpty()){
                System.out.println("removed" + queue.remove());
            }

        } catch (Exception ex){
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("This will happen anyway");
        }

        System.out.println("This still works");
    }
}
