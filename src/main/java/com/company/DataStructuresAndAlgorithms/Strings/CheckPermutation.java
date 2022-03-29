package com.company.DataStructuresAndAlgorithms.Strings;

import java.util.Arrays;

public class CheckPermutation {
    public static boolean permutation(String word1,String word2){

        return sort(word1).equals(sort(word2));
    }

    public static String sort(String word){
        String sample = word.replace(" ","");
        char[] temp = sample.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }

    public static void main(String[] args) {
        String word1 = "god ";
        String word2 ="dog";
        System.out.println(permutation(word1,word2));
    }
}
