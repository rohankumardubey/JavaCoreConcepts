package com.company.DataStructuresAndAlgorithms.Recussion;

public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(5));
    }
    public static boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        if(n%4==0) return isPowerOfFour(n/4);
        else return false;
    }
}
