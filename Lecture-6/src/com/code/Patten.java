package com.code;

public class Patten {

    public static void main(String[] args) {
        triangle(0, 3);
    }

    public static void triangle(int start, int end){

        if (end == 0){
            return;
        }

        if (start == end){
            triangle(0, end - 1);
            System.out.println();
            return;
        }



        triangle(start+1, end);

        System.out.print("* ");

    }

}
