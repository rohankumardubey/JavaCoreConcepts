package com.company.DataStructuresAndAlgorithms.ArrayUsage;

import java.util.Arrays;

public class ReplaceRightLargest {
    public static int[] nonOptimizedreturnList(int[] arr){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(max<arr[j]){
                    max=arr[j];
                }
            }
            arr[i]=max;
            max=0;
        }
        arr[arr.length-1]=-1;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(nonOptimizedreturnList(arr)));
        //17,18,5,4,6,1

        //18,17,6,5,4,1

    }
}
