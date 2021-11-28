package com.company.DataStructuresAndAlgorithms.Recussion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(digitSum(123));
    }
    public static int digitSum(int digit){
        if(digit<=0)
            return 0;
        return digit%10+digitSum(digit/10);
    }
}
