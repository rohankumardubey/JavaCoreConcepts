package com.company.DataStructuresAndAlgorithms.Recussion;

public class ProductOfArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(productofArray(array,array.length));
    }

    public static int productofArray(int[] array, int n)
    {
        if(n<0) return -1;
        if(n==0) return array[0];
        return array[n-1]*productofArray(array,n-1);
    }
}
