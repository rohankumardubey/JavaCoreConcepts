package com.company.DataStructuresAndAlgorithms.Recussion;

public class GcdCalculator {
    public static void main(String[] args) {
        System.out.println(gcd(4,5));
    }
    public static int gcd(int num1,int num2){
        if(num1<0||num2<0) return -1;
        if(num2==0) return num1;
        return gcd(num2,num1%num2);
    }
}
