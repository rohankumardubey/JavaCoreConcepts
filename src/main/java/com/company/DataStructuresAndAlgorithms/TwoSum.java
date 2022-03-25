package com.company.DataStructuresAndAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] summing(int[] arr,int sum){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int compare = sum - arr[i];
            if(map.containsKey(compare)){
                return new int[]{map.get(compare),i};
            }
            else{
                map.put(arr[i],i);
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        int sum=7;
        int[] result = summing(arr,sum);
        if(result.length==2){
            System.out.println(result[0]+":"+result[1]);
        }
        else {
            System.out.println("element not found");
        }
    }
}
