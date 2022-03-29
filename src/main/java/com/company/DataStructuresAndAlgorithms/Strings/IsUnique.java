package com.company.DataStructuresAndAlgorithms.Strings;

import com.company.Array;

import java.util.Arrays;
import java.util.HashSet;

public class IsUnique {
    public static boolean calUnique(String word){
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            set.add(word.charAt(i));
        }
        return set.size()==word.length();
    }

    public static boolean calUniqueOptimised(String word){
        char[] array = word.toCharArray();
        Arrays.sort(array);
        for (int i = 0; i < array.length-1; i++) {
            if(array[i+1]-array[i]==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String sample = "caab";
//        System.out.println(calUnique(sample));
        System.out.println(calUniqueOptimised(sample));
    }
}
