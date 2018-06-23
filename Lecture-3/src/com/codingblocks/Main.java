package com.codingblocks;

public class Main {

    static void tempList(int start, int end, int step){

        while (start <= end){
            float f = (5f/9) * (start - 32);
            System.out.println(start + " " + f);

            start = start + step;
        }
    }

    public static void main(String[] args) {
	// write your code here

        tempList(0, 300, 20);

        {
            int i = 24;
            {
                int j = 45;
            }


        }



    }


}
