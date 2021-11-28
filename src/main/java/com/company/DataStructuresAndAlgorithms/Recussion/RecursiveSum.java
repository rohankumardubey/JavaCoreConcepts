package com.company.DataStructuresAndAlgorithms.Recussion;

public class RecursiveSum {
    public static void main(String[] args) {

        int[] array = {1,2,3};
        System.out.println(sum(array,array.length));


    }
    public static int sum(int[] array,int n){
        int result=0;
        if(n==1){
            return array[0];
        }
        result=sum(array,n-1);
        result=result+array[n-1];
        return result;

    }
}
