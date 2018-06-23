package com.codingblocks;

public class SringExample {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        System.out.println(s1.equals(s2));

        String greet = "Hello World";

        System.out.println(greet.charAt(0));

//        String sub = greet.substring(0, 7);

//        System.out.println(sub);

//        display(greet);

//        s1 = s1 + 24;
//
//        s1 = s1.concat(Integer.toString(24));

        System.out.println(greet.indexOf('x', 5));

        System.out.println(s1);

//        printSubString(greet);

        System.out.println(greet.startsWith("Hell"));

        System.out.println(greet.startsWith("Wor", 6));

    }

    public static void display(String line){
        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));
        }
    }

    public static void printSubString(String line){
        for (int i = 0; i <= line.length(); i++) {
            for (int j = i+1; j <= line.length(); j++) {
                System.out.println(line.substring(i, j));
            }
        }
    }

    public static void printPallin(String line){
        for (int i = 0; i <= line.length(); i++) {
            for (int j = i+1; j <= line.length(); j++) {
                String temp = line.substring(i, j);
                if (isPallin(temp)){
                    System.out.println(temp);
                }
            }
        }
    }

    public static void printAllLocation(String line, char ch){

        int start = 0;

        while (true){

            int loc = line.indexOf(ch, start);

            if (loc == -1){
                break;
            }

            System.out.println(loc);
            start = loc + 1;


        }
    }

    public static boolean isPallin(String line){
        int start = 0;
        int end = line.length() - 1;

        while (start < end){
            if (line.charAt(start) != line.charAt(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
