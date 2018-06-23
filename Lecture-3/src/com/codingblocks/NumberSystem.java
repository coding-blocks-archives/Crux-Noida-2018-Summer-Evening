package com.codingblocks;

public class NumberSystem {

    public static void main(String[] args) {
        System.out.println(deci2bin(37));
        System.out.println(deci2any(19, 8));
    }


    public static int deci2bin(int deci){

        int bin = 0;
        int pow = 1;

        while (deci > 0){
            int r = deci % 2;
            deci = deci / 2;

            bin = bin + pow * r;
            pow = pow * 10;
        }

        return bin;
    }

    public static int deci2any(int deci, int base){

        int any = 0;
        int pow = 1;

        while (deci > 0){
            int r = deci % base;
            deci = deci / base;

            any = any + pow * r;
            pow = pow * 10;
        }

        return any;
    }

    public static int bin2deci(int bin){
        int deci = 0;
        int pow = 1;

        while (bin > 0){
            int r = bin % 10;
            bin = bin / 10;

            deci = deci + pow * r;

            pow = pow * 2;
        }

        return deci;
    }

    public static int any2deci(int any, int base){
        int deci = 0;
        int pow = 1;

        while (any > 0){
            int r = any % 10;
            any = any / 10;

            deci = deci + pow * r;

            pow = pow * base;
        }

        return deci;
    }

    public static int any2any(int source, int sbase, int dbase){
        int deci = any2deci(source, sbase);

        return deci2any(deci, dbase);
    }
}











