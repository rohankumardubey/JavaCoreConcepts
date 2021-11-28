package com.company.DataStructuresAndAlgorithms.Recussion;

public class FactorialRecursion {
    public static void main(String[] args) {
        int result = 0;
        result = factorial(4);
        System.out.println(result);
    }

    public static int factorial(int i) {
        if (i < 0) {
            return -1;
        }
        if (i == 0 || i == 1) {
            return 1;
        }
        return i * factorial(i - 1);

    }
}
