package com.codingblocks;

public class MCS {
    public static int maxCSubseq(String first, String second, int f, int s){

        if (f == 0 || s == 0){
            return 0;
        }

        if (first.charAt(f-1) == second.charAt(s - 1)){
            return 1 + maxCSubseq(first, second, f - 1, s - 1);
        } else {
            int left = maxCSubseq(first, second, f - 1, s);
            int right = maxCSubseq(first, second, f, s - 1);

            return Math.max(left, right);
        }

    }

    public static int macSubItr(String first, String second){

        int[][] mem = new int[first.length()+1][second.length() +  1];

        for (int f = 0; f <= first.length() ; f++) {
            for (int s = 0; s <= second.length(); s++) {
                if (f == 0 || s == 0){
                    mem[f][s] = 0;
                } else {
                    if (first.charAt(f-1) == second.charAt(s-1)){
                        mem[f][s] = 1+ mem[f-1][s-1];
                    } else {
                        int up = mem[f-1][s];
                        int left = mem[f][s-1];

                        mem[f][s] =  Math.max(up, left);
                    }
                }
            }
        }

        return mem[first.length()][second.length()];

    }

    public static int maxCSubseqDP(String first, String second, int f, int s, int[][] mem){

        if (f == 0 || s == 0){
            return 0;
        }

        if (mem[f][s] != -1){
            return mem[f][s];
        }

        if (first.charAt(f-1) == second.charAt(s - 1)){
            mem[f][s] =  1 + maxCSubseq(first, second, f - 1, s - 1);
        } else {
            int left = maxCSubseq(first, second, f - 1, s);
            int right = maxCSubseq(first, second, f, s - 1);

            mem[f][s] =  Math.max(left, right);
        }

        return mem[f][s];

    }
}
