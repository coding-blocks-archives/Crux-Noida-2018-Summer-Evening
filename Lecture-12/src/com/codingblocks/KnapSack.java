package com.codingblocks;

public class KnapSack {

    public static void main(String[] args) {
        int[] weight = {11, 10, 10};
        int[] price = {3, 2, 2};

        int cap = 20;

        int[][] mem = new int[weight.length + 1][cap + 1];

        for (int i = 0; i <= weight.length; i++) {
            for (int j = 0; j <= cap ; j++) {
                mem[i][j] = -1;
            }
        }

        System.out.println(knapDP(weight, price, 0, cap, mem));

//        System.out.println(knap(weight, price, 0, 20));
    }

    public static int knap(int[] weight, int[] price, int index, int capacity){

        if (capacity == 0 || index == weight.length){
            return 0;
        }

        int included = 0;

        if (weight[index] <= capacity){
            included = price[index] + knap(weight, price, index+1, capacity-weight[index]);
        }

        int excluded = knap(weight, price, index+1, capacity);

        return Math.max(included, excluded);

    }

    public static int knapDP(int[] weight, int[] price, int index, int capacity, int[][] mem){

        if (capacity == 0 || index == weight.length){
            return 0;
        }

        if (mem[index][capacity] != -1){
            return mem[index][capacity];
        }

        int included = 0;

        if (weight[index] <= capacity){
            included = price[index] + knapDP(weight, price, index+1, capacity-weight[index], mem);
        }

        int excluded = knapDP(weight, price, index+1, capacity, mem);

        mem[index][capacity] =  Math.max(included, excluded);

        return mem[index][capacity];

    }
}
