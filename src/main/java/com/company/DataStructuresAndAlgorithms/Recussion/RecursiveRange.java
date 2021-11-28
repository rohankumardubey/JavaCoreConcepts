package com.company.DataStructuresAndAlgorithms.Recussion;

public class RecursiveRange {
    public static void main(String[] args) {
        System.out.println(range(3));
    }
    public static int range(int number){
        if(number<0) return 0;
        if(number==0) return 0;
        return number+range(number-1);
    }
}
