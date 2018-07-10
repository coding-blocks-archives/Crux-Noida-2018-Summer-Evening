package com.codingblocks;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File file = new File(".");

        explorer(file, "");
//
//        System.out.println(file.getAbsolutePath());
//
//        System.out.println(file.exists());
    }

    public static void explorer(File file, String indent){

        System.out.println(indent + file.getName());

        if (!file.isDirectory()){
            return;
        }

        File[] files = file.listFiles();

        for (int i = 0; i < files.length; i++) {
            explorer(files[i], indent + "\t");
        }
    }
}
