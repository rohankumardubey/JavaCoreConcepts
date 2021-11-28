package com.company.DataStructuresAndAlgorithms;

public class TimeComplexityAnalysis {
    public static int findsumUsingFormulae(int n){
        return (n*(n+1))/2;
    }

    public static int findSum(int m){
        int sum=0;
        for (int i = 0; i <=m ; i++) {
            sum=sum+i;
        }
        return sum;
    }

    public static void main(String[] args) {

        double now1 = System.nanoTime();
        System.out.println("result: "+ TimeComplexityAnalysis.findSum(1000));
        double current1 = System.nanoTime();
        System.out.println("time taken for findSum method :"+(current1-now1));
        double now = System.nanoTime();
        System.out.println("result: "+ TimeComplexityAnalysis.findsumUsingFormulae(1000));
        double current = System.nanoTime();
        System.out.println("time taken for findsumUsingFormulae method:"+(current-now));

    }
}
