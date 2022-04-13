package com.company.DataStructuresAndAlgorithms.ArrayUsage;

import java.util.ArrayList;
import java.util.Arrays;
//1,0,0,2,4,0,5
//1,2,4,0,0

public class MoveZeros {
    public static int[] nonOptimizedUsingArrayList(int[] arr){
        ArrayList<Integer> temp = new ArrayList<>();
        int[]  result = new int[arr.length];
        int counter=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                counter++;
            }else{
                temp.add(arr[i]);
            }
        }

        while(counter==0){
            temp.add(0);
            counter--;
        }

        for (int i = 0; i < temp.size(); i++) {
            result[i]=temp.get(i);
        }

        return result;
    }

    //1,0,0,2,0,3,4,0,5
    //1,2,4,5,0,0,0

    public static int[] nonOptimisedExtraSpace(int[] arr){
        int[]  result = new int[arr.length];
        int counter=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                counter++;
            }
            else{
                result[i-counter]=arr[i];
            }
        }
        return result;
    }


    public static int[] optimised(int[] arr){
        int left=0;
        int right=0;
        int temp;
        while(right<arr.length){
            if(arr[right]==0){
                right++;
            }
            else{
                temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
                right++;
                left++;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {1,0,0,2,0,3,0,4,0,5};
        System.out.println(Arrays.toString(nonOptimizedUsingArrayList(arr)));
        System.out.println(Arrays.toString(nonOptimisedExtraSpace(arr)));
        System.out.println(Arrays.toString(optimised(arr)));

    }
}
