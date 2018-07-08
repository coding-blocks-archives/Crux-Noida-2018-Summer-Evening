package com.codingblocks;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // now we are smart github users

        int[] currency = {50, 1000, 100, 500, 10, 5, 1};

        Arrays.sort(currency);

        System.out.println(Arrays.toString(currency));

        int target = 654;

        int notes = noteCount(currency, currency.length-1, target);



//        for (int i = currency.length - 1; i >= 0 ; i--) {
//            while (target >= currency[i]){
//                target = target - currency[i];
//                notes++;
//            }
//        }
//
        System.out.println(notes);
    }

    public static int noteCount(int[] currency, int end, int target) {
        if (target == 0){
            return 0;
        }

        if (currency[end] <= target){
            return 1 + noteCount(currency, end, target - currency[end]);
        }
        else {
            return noteCount(currency, end - 1, target);
        }
    }
}
