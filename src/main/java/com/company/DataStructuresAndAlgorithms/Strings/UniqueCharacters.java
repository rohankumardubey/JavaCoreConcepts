package com.company.DataStructuresAndAlgorithms.Strings;


import java.util.Arrays;
import java.util.HashSet;

public class UniqueCharacters {
    //o(n) time complexity o(n) space
    public static boolean unique(String str) {
        HashSet<Character> cha = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!cha.contains(str.charAt(i))) {
                cha.add(str.charAt(i));
            }
            else{
                return false;
            }
        }
        return cha.size()==str.length();
    }

    //o(26) time complexity and o(26) complexity
    public static boolean optimizedUnique(String str){
        boolean[] bool = new boolean[25];
        Arrays.fill(bool,false);
        for (int i = 0; i < str.length(); i++) {
            int temp = str.toCharArray()[i];
            if(bool[temp-97]){
                return false;
            }
            else{
                bool[temp-97]=true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String sample = "abcdefe";
//        System.out.println(unique(sample));
        System.out.println(optimizedUnique(sample));
    }
}
