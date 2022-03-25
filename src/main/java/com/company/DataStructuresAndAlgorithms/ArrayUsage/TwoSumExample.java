package com.company.DataStructuresAndAlgorithms.ArrayUsage;

import java.util.*;

public class TwoSumExample {

    public static int[] twoSum(int[] arr, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i);
        }


        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(target-arr[i])){
                return new int[]{map.get(target-arr[i]),i};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {2, 17, 11, 15,7};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
}
