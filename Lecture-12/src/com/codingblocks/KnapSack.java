package com.codingblocks;

public class KnapSack {

    public static void main(String[] args) {
        int[] weight = {2, 1, 3, 2};
        int[] price = {3, 2, 5, 1};

        int cap = 5;

        int[][] mem = new int[weight.length + 1][cap + 1];

        for (int i = 0; i <= weight.length; i++) {
            for (int j = 0; j <= cap ; j++) {
                mem[i][j] = -1;
            }
        }

        System.out.println(knapITR(weight, price, cap));

//        System.out.println(knap(weight, price, 0, 20));
    }

    public static int knapITR(int[] weight, int[] price, int capacity){
        int[][] mem = new int[weight.length + 1][capacity+ 1];

        for (int size = 0; size <= weight.length ; size++) {
            for (int cap = 0; cap <= capacity; cap++) {
                if (size == 0 || cap == 0){
                    mem[size][cap] = 0;
                } else {
                    int include = 0;
                    if (cap >= weight[size-1]){
                        include = price[size-1] + mem[size-1][cap - weight[size-1]];
                    }

                    int exclude = mem[size-1][cap];

                    mem[size][cap] = Math.max(include, exclude);
                }
            }
        }

        for (int i = 0; i <= weight.length; i++) {
            for (int j = 0; j <= capacity ; j++) {
                System.out.print(mem[i][j] + "\t");
            }
            System.out.println();
        }

        return mem[weight.length][capacity];
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
