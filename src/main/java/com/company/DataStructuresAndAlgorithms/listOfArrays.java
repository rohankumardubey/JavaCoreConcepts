package com.company.DataStructuresAndAlgorithms;

import java.util.ArrayList;

public class listOfArrays {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("d");
        arr.add("e");
        arr.add("f");
        for (int i = 0; i < arr.size(); i++) {
            arr.add(String.valueOf(i));
            System.out.println(arr.get(i));
        }
    }
}
