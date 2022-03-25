package com.company.DataStructuresAndAlgorithms.ArrayUsage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class NonEmptyArray {
    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 1, 2};
        System.out.println(nonEmpty(arr));

    }

    public static Integer nonEmpty(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int pointer = 0;
        while (pointer < arr.length) {
            if (!set.contains(arr[pointer])) {
                set.add(arr[pointer]);
            } else {
                set.remove(arr[pointer]);
            }
            pointer++;
        }
        List<Integer> res1 = new ArrayList<>(set);
        Integer[] res2 = set.toArray(new Integer[set.size()]);
        System.out.println(res1.get(0));
        return res2[0];
    }
}