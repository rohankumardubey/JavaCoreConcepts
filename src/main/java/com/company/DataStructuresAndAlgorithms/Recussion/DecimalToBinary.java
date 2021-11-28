package com.company.DataStructuresAndAlgorithms.Recussion;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(convertDecimal(13));
    }

    public static int convertDecimal(int number){
        int remainder;
        if(number<0) return -1;
        if(number == 0) return 0;
        return number%2+10*convertDecimal(number/2);
    }
}