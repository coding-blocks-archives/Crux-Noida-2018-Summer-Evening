package com.codingblocks;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int mazeCount(int row, int col){

        if (row == 1 || col == 1){
            return 1;
        }

        return mazeCount(row - 1, col) +
                mazeCount(row, col - 1);
    }

    public static void mazePrint(String path, int row, int col){

        if (row == 1 && col == 1){
            System.out.println(path);
            return;
        }


        if (row > 1) {
            mazePrint(path + "V",row - 1, col);
        }

        if (col > 1){
            mazePrint(path + "H",row, col - 1);
        }

        if (row > 1 && col > 1 && row == col){
            mazePrint(path + "D",row - 1, col - 1);
        }

    }

    public static ArrayList mazeList(String path, int row, int col){

        if (row == 1 && col == 1){
            ArrayList list = new ArrayList();
            list.add(path);
            return list;
        }

        ArrayList list = new ArrayList();

        if (row > 1) {
            list.addAll(mazeList(path + "V",row - 1, col));

        }

        if (col > 1){
            list.addAll(mazeList(path + "H",row, col - 1));
        }

        if (row > 1 && col > 1 && row == col){
            list.addAll(mazeList(path + "D",row - 1, col - 1));
        }

        return list;

    }
}
