package com.company.DataStructuresAndAlgorithms.ArrayUsage;

public class LargestSum {
    public static int largeSum(int[] arr) {
        int maxVal = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = Math.max(sum + arr[i], arr[i]);
            maxVal = Math.max(maxVal, sum);
        }
        return maxVal;

    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(largeSum(arr));

    }
}
