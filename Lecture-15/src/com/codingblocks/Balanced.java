package com.codingblocks;

import java.util.Stack;

public class Balanced {
    public static void main(String[] args) {
        String line = "{a + b + [(1+c) + {a}]}";

        Stack<Character> stack = new Stack<>();

        boolean valid = true;

        for (int i = 0; i < line.length() && valid; i++) {
            char ch = line.charAt(i);
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            } else if (ch == ')'){
                if (stack.peek() == '('){
                    stack.pop();
                } else {
                    valid = false;
                }
            }else if (ch == '}'){
                if (stack.peek() == '{'){
                    stack.pop();
                }else {
                    valid = false;
                }
            }else if (ch == ']'){
                if (stack.peek() == '['){
                    stack.pop();
                }else {
                    valid = false;
                }
            }
        }

        if (valid){
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

    }
}
