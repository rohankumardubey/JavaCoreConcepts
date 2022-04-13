package com.company.DataStructuresAndAlgorithms.ArrayUsage;

import java.util.HashMap;

public class MajorityElement {
    public static int nonOpmizedmajority(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxVal = 0;
        for (int arrVal : arr) {
            if (map.containsKey(arrVal)) {
                map.put(arrVal, map.get(arrVal) + 1);
            } else {
                map.put(arrVal, 1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            maxVal = Math.max(maxVal, map.get(arr[i]));
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == maxVal) {
                if (maxVal >= (arr.length / 2)) {
                    return arr[i];
                }
            }
        }

        return -1;
    }

    //bayer moore algorithm
    public static int opmizedmajority(int[] arr) {
        int count=0;
        int left=0;
        int majority=arr[0];
        while(left<arr.length){
            if(arr[left]==majority){
                count++;
            }else{
                count--;
                if(count==0){
                    majority=arr[left+1];
                }
            }
            left++;
        }
        return majority;
    }

    public static void main(String[] args) {

        int[] arr = {2,2,1,1,1,2,2};
//        System.out.println(nonOpmizedmajority(arr));
        System.out.println(opmizedmajority(arr));
    }
}
