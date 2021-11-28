package com.company.DataStructuresAndAlgorithms.Recussion;

public class RecursionSampleUsage {
    public static void main(String[] args) {
        rec(10);
    }
    public static void rec(int sample){
        if(sample <1){
            System.out.println("value is less then 1");
        }else{
            rec(sample-1);
            System.out.println(sample);
        }
    }
}
