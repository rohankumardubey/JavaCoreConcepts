package com.company;

public class CustomArguments {

    public static int add(int... values) {
        int result = 0;
        for (int value : values) {
            result += value;
        }
        return result;
    }

    public static void main(String[] args) {

        int sample = add(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(sample);
    }
}
