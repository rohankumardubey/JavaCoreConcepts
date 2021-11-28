package com.company.DataStructuresAndAlgorithms.Recussion;

public class PowerCalculator {
    public static void main(String[] args) {
        System.out.println(numberPower(2,4));
    }

    public static int numberPower(int base,int power){
        if(base <= 0 || power <=0)
            return 1;
        return base*numberPower(base,power-1);
    }
}
