package com.company.GenericsUsage;

import java.util.ArrayList;
import java.util.List;

public class GenericSample {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        List<Integer> b = new ArrayList<>();
        List<String> c = new ArrayList<>();
        c.add("a");
        c.add("b");
        c.add("c");
        List<String> d = new ArrayList<>();
        System.out.println(genericSample(a,b));
        System.out.println(genericSample(c,d));
    }

    public static <T> List<T> genericSample(List<T> first, List<T> second){
        for (T t: first) {
            second.add(t);
        }
        return second;

    }
}
