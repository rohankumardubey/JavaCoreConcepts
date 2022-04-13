package com.company.DataStructuresAndAlgorithms.ArrayUsage;

import java.util.ArrayList;
import java.util.HashSet;

public class MaximumLengthofaConcatenatedStringwithUniqueCharacters {
    public static int maxLength(ArrayList<String> arr) {
        int maxValue = 0;
        HashSet<Character> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (i != j) {
                    list.add(arr.get(j));
                } else {
                    list.add(arr.get(i));
                }
            }
        }

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                set.add(list.get(i).charAt(j));
            }
            if (list.get(i).length() == set.size()) {
                list1.add(list.get(i));
            }
            set.clear();
        }

        System.out.println(list1);

        for (String s : list1) {
            maxValue = Math.max(maxValue, s.length());
        }
        return maxValue;
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
//        arr.add("abcdefghijklmnopqrstuvwxyz");
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("d");
        arr.add("e");
        arr.add("f");
        arr.add("g");
        arr.add("h");
        arr.add("i");
        arr.add("j");
        arr.add("k");
        arr.add("l");
        arr.add("m");
        arr.add("n");
        arr.add("o");
        arr.add("p");

//        String[] arr = {"cha","r","act","ers"};
//        String[] arr = {"abcdefghijklmnopqrstuvwxyz"};
        System.out.println(maxLength(arr));
    }
}
