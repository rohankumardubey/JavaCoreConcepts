package com.company.DataStructuresAndAlgorithms;

import java.util.HashSet;

public class ThreeSum {
    static boolean find3Numbers(int A[],int arr_size, int sum)
    {
        for (int i = 0; i < arr_size - 2; i++) {
            HashSet<Integer> s = new HashSet<Integer>();
            int curr_sum = sum - A[i];
            for (int j = i + 1; j < arr_size; j++)
            {
                if (s.contains(curr_sum - A[j]))
                {
                    System.out.printf("Triplet is %d,%d, %d", A[i],
                    A[j], curr_sum - A[j]);
                    return true;
                }
                s.add(A[j]);
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[] A = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int arr_size = A.length;
        System.out.println(find3Numbers(A, arr_size, sum));

    }
}
