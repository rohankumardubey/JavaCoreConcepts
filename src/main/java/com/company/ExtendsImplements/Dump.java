package com.company.ExtendsImplements;

import java.util.*;

public class Dump {
    public static void main(String[] args) {
        String sample = "rohan,hi,how,are,you";
        StringBuilder build = new StringBuilder();
        List<String> elephantList = Arrays.asList(sample.split(","));
        Iterator<String> it = elephantList.iterator();
        while(it.hasNext()){
            build.append(" -f ").append(it.next());
        }

        System.out.println(build.toString());
        System.out.println(Collections.emptyList());
        System.out.println(List.of());
    }
}
