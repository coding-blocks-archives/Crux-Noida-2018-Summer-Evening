package com.codingblocks;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        float[] price = {223, 456, 566, 346, 546};

        float[] weight = {4, 5, 3, 5, 1};

        Item[] items = new Item[price.length];

        for (int i = 0; i < price.length; i++) {
            float rate = price[i]/weight[i];
            items[i] = new Item(rate, weight[i]);
        }

        Arrays.sort(items);

        for (Item item: items) {
            System.out.println(item);
        }

        float bag = 8;

        float value = 0;

        for (int i = 0; i < items.length && bag > 0; i++) {
            if (bag < items[i].weight){
                value += bag * items[i].rate;
                bag = 0;
            } else {
                value += items[i].weight * items[i].rate;
                bag -= items[i].weight;
            }
        }

        System.out.println(value);

    }

    private static class Item implements Comparable<Item> {
        private float rate;
        private float weight;

        public Item(float rate, float weight) {
            this.rate = rate;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return rate + " : " + weight;
        }

        @Override
        public int compareTo(Item o) {
            if (this.rate > o.rate){
                return -1;
            } else if (this.rate < o.rate){
                return 1;
            } else {
                return 0;
            }
        }
    }
}
