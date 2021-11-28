package com.company;

import java.util.Stack;

public class StackUsage {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        while(!stack.empty()){
            System.out.print(stack.pop());
            System.out.print(",");
        }
    }
}
