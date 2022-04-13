package com.company.DataStructuresAndAlgorithms.ArrayUsage;

//input :- 1,7,3,6,5,6
//output :- 3
public class FindPivotIndex {
    public static int nonOptimisedpivotElement(int[] arr) {
        int pivot = 0;
        int left = 0;
        int leftsum = 0;
        int rigthsum = 0;
        int right = arr.length - 1;
        while (pivot < arr.length) {
            while (left < pivot) {
                leftsum = leftsum + arr[left];
                left++;
            }
            while (right > pivot) {
                rigthsum = rigthsum + arr[right];
                right--;
            }
            if (rigthsum == leftsum) {
                return pivot;
            }
            rigthsum = 0;
            leftsum = 0;
            right = arr.length - 1;
            left = 0;
            pivot++;
        }
        return -1;
    }

    public static int OptimisedpivotElement(int[] arr) {
        int pivot = 0;
        int totalsum = 0;
        int leftsum = 0;
        for (int j : arr) {
            totalsum = totalsum + j;
        }

        while (pivot < arr.length) {
            if (pivot == 0) {
                leftsum = 0;
            } else {
                leftsum = leftsum + arr[pivot - 1];
            }
            if (totalsum - arr[pivot] - leftsum == leftsum) {
                return pivot;
            }
            pivot++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, -1, 1};
//        System.out.println(nonOptimisedpivotElement(arr));
        System.out.println(OptimisedpivotElement(arr));
    }
}
