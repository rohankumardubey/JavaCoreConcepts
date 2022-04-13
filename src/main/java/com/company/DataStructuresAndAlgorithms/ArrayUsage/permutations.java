package com.company.DataStructuresAndAlgorithms.ArrayUsage;

import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        ArrayList<String > arr = new ArrayList<>();
//        arr.add("a");
//        arr.add("b");
//        arr.add("c");
//        arr.add("d");
//        arr.add("e");
//        arr.add("f");
//        arr.add("g");
//        arr.add("h");
//        arr.add("i");
//        arr.add("j");
//        arr.add("k");
//        arr.add("l");
//        arr.add("m");
//        arr.add("n");
//        arr.add("o");
//        arr.add("p");

//        "cha","r","act","ers"

        arr.add("cha");
        arr.add("r");
        arr.add("act");
        arr.add("ers");
        String str = "";
        for (int i = 0; i < arr.size(); i++) {
            str="";
            for (int j = 0; j < arr.size(); j++) {
                if(i!=j) {
                    str+=arr.get(i);
                }
                else{
                    str+=arr.get(j);
                }
            }
            System.out.println(str);
            str="";
        }

        System.out.println(str);

    }
}
