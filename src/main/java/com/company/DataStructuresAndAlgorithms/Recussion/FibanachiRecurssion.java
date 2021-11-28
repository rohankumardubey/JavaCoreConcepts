package com.company.DataStructuresAndAlgorithms.Recussion;

public class FibanachiRecurssion {
    public static void main(String[] args) {
        int range=10;
        for (int i = 0; i <=range ; i++) {
            System.out.println(fib(i));
        }

    }

    public static int fib(int n) {
        if(n<0)
            return -1;
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fib(n-1)+fib(n-2);

    }
}
