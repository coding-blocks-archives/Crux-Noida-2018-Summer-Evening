package com.codingblocks;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        subseq("", "ab");
//        System.out.println(subseqList("", "ABC"));

//        System.out.println(permuteList("", "ABC     "));

        dice("", 12);
    }

    public static void subseq(String processed, String unprocessed){

        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        unprocessed = unprocessed.substring(1);

        subseq(processed + ch, unprocessed);
        subseq(processed, unprocessed);

    }

    public static ArrayList subseqList(String processed, String unprocessed){

        if (unprocessed.isEmpty()){
            ArrayList list = new ArrayList();
            list.add(processed);
            return list;
        }

        char ch = unprocessed.charAt(0);

        unprocessed = unprocessed.substring(1);

        ArrayList list = new ArrayList();

        ArrayList left = subseqList(processed + ch, unprocessed);
        ArrayList right = subseqList(processed, unprocessed);

        list.addAll(left);
        list.addAll(right);

        return  list;

    }

    public static void ascii(String processed, String unprocessed){

        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        unprocessed = unprocessed.substring(1);

        ascii(processed + ch, unprocessed);
        ascii(processed, unprocessed);
        ascii(processed + (ch + 0), unprocessed);

    }

    public static void numpad(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        int digit = unprocessed.charAt(0) - '0';
        unprocessed = unprocessed.substring(1);

        for (int i = 3 * (digit - 1); i < 3 * digit; i++) {

            if (i == 26){
                break;
            }

            char ch = (char)('a' + i);

            numpad(processed + ch, unprocessed);
        }

    }

    public static void permute(String processed, String unprocessed){


        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        unprocessed = unprocessed.substring(1);

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i);

            permute(first + ch + second, unprocessed);
        }
    }


    public static ArrayList permuteList(String processed, String unprocessed){


        if (unprocessed.isEmpty()){
            ArrayList list = new ArrayList();
            list.add(processed);
            return list;
        }

        char ch = unprocessed.charAt(0);

        unprocessed = unprocessed.substring(1);

        ArrayList list = new ArrayList();

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i);

            ArrayList temp = permuteList(first + ch + second, unprocessed);
            list.addAll(temp);
        }

        return list;
    }

    public static void dice(String processed, int num){

        if (num == 0){
            System.out.println(processed);
            return;
        }


        for (int i = 1; i <= 6 && i <= num; i++) {
            dice(processed + i, num - i);
        }
    }
}
