package com.company.DataStructuresAndAlgorithms;

public class GcdCalculator {
    public static int gcdCal(int m,int n){
        if(n==0){
            System.exit(1);
        }
        if(m%n==0){
            return n;
        }
        if(m%n>0){
            return gcdCal(n,m%n);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(gcdCal(2,4));
    }
}
