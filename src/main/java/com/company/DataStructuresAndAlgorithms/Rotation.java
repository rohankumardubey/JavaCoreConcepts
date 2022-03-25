package com.company.DataStructuresAndAlgorithms;

public class Rotation {
    public static int returnSum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=i*arr[i];
        }
        return sum;
    }

    public static int[] rotateArr(int[] arr){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {8,3,1,2};
        int maxSum=0;

        //complexity is o(^2)
        for(int i=0;i<arr.length;i++){
            arr=rotateArr(arr);
            if(maxSum<returnSum(arr)){
                maxSum=returnSum(arr);
            }
        }
        System.out.println(maxSum);
    }
}
