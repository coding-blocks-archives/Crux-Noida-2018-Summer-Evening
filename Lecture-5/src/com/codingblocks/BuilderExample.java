package com.codingblocks;

public class BuilderExample {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Hello");

        builder.append(" World");

        System.out.println(toggle("Hello World"));

        String s = builder.toString();

        System.out.println(builder.toString());
    }

    public static String toggle(String line){
        StringBuilder builder = new StringBuilder(line);

        // process

        for (int i = 0; i < builder.length(); i++) {
            char ch = builder.charAt(i);

            if (ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch - 'A' + 'a');
            } else if (ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - 'a' + 'A');
            }

            builder.setCharAt(i, ch);

        }

        return builder.toString();
    }

    public static String diffStrng(String line){

        StringBuilder builder = new StringBuilder();

        builder.append(line.charAt(0));

        for (int i = 1; i < line.length(); i++) {
            char ch = line.charAt(i);
            char last = builder.charAt(builder.length()-1);

            int k = Math.abs(ch - last);

            builder.append(k);
            builder.append(ch);
        }

    }
}






