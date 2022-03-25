package com.company.DataStructuresAndAlgorithms.ArrayUsage;

import java.util.Arrays;
import java.util.HashSet;

//100,4,200,1,3,2
public class LongestConsSequence {
    public static int nonOptimizedSeq(int[] arr) {
        Arrays.sort(arr);
        int left =0;
        int counter = 1;
        int maxVal=0;
        while(left<arr.length-1){
            if(arr[left]==arr[left+1]-1){
                counter++;
            }
            else{
                counter=0;
            }
            maxVal=Math.max(maxVal,counter);
            left++;
        }
        return maxVal;
    }

    public static int OptimizedSeq(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for (int i = 0; i <arr.length ; i++) {
            set.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if(!set.contains(arr[i]-1)){
                int j = arr[i];
                while(set.contains(j)){
                    j++;
                }
                ans=Math.max(ans,j-arr[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2, 201};
//        System.out.println(nonOptimizedSeq(arr));
        System.out.println(OptimizedSeq(arr));
    }
}
