package com.company.DataStructuresAndAlgorithms.ArrayUsage;

import java.util.ArrayList;
import java.util.Arrays;

public class SquaresofaSortedArray {
    public static int[] nonOptimisedsorting(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]*arr[i];
        }

        Arrays.sort(arr);
        return arr;
    }
//-4,-1,0,3,10
    //-1,-4,0,3,10
    //0,-4,-1,3,10
    //0,-1,-4,3,10

    public static int[]  optimised(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int left=0;
        int right=arr.length-1;
        while(left <= right){
            if((-1*arr[left])>arr[right]){
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                right--;
            }
        }
        for (int i = list.size()-1; i>=0; i--) {
            arr[arr.length-i-1]=list.get(i);

        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]*arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[]  arr = {-7,-3,2,3,11};
//        System.out.println("**"+Arrays.toString(nonOptimisedsorting(arr)));
        System.out.println("**"+Arrays.toString(optimised(arr)));
    }
}
