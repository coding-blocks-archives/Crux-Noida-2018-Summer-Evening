package com.codingblocks;

public class Edit {

    public static void main(String[] args) {
        String first = "mohit";
        String second = "mohini";

        System.out.println(edit(first, second, first.length(), second.length()));
    }

    public static int edit(String first, String second, int f, int s){

        if (f == 0){
            return s;
        } else if (s == 0){
            return f;
        }

        if (first.charAt(f-1) == second.charAt(s-1)){
            return edit(first, second, f-1, s-1);
        } else {
            int insert = 1 + edit(first, second, f, s-1);
            int delete = 1 + edit(first, second, f-1, s);
            int replace = 1 + edit(first, second, f-1, s-1);

            return Math.min(insert, Math.min(delete, replace));

        }

    }
}
