package com.company.DataStructuresAndAlgorithms.ArrayUsage;

public class MaxTwoElements {
    public static void maxValue(int[] arr){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        int counter=0;
        for (int i = 0; i < arr.length; i++) {
            largest=Math.max(largest,arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=largest){
                secondLargest=Math.max(secondLargest,arr[i]);
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);
    }

    public static void main(String[] args) {

        int[] arr = {3,2,4,5,6,7,1,8,9,12,11};
        maxValue(arr);
    }
}
