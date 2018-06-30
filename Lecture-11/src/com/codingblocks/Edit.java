package com.codingblocks;

public class Edit {

    public static void main(String[] args) {
        String first = "mohit";
        String second = "mohini";


        int[][] mem = new int[first.length()+1][second.length()+1];

        for (int i = 0; i <= first.length(); i++) {
            for (int j = 0; j <= second.length() ; j++) {
                mem[i][j] = -1;
            }
        }

        System.out.println(edit(first, second, first.length(), second.length(), mem));


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

    public static int edit(String first, String second, int f, int s, int[][] mem){

        if (f == 0){
            return s;
        } else if (s == 0){
            return f;
        }

        if (mem[f][s] != -1){
            return mem[f][s];
        }

        if (first.charAt(f-1) == second.charAt(s-1)){
            mem[f][s] = edit(first, second, f-1, s-1, mem);
        } else {
            int insert = 1 + edit(first, second, f, s-1, mem);
            int delete = 1 + edit(first, second, f-1, s, mem);
            int replace = 1 + edit(first, second, f-1, s-1, mem);

            mem[f][s] = Math.min(insert, Math.min(delete, replace));
        }

        return mem[f][s];
    }
}
