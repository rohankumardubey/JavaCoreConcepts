package com.company.GenericsUsage;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {
    public static void main(String[] args) {
        Character[] charArray = {'a','b','c'};
        Integer[]intArray = {1,2,3};
        Boolean[] boolArray = {true,false,true};

        List<Character> charList =arrayList(charArray,new ArrayList<>());
        List<Integer> intList =arrayList(intArray,new ArrayList<>());
        List<Boolean> boolList =arrayList(boolArray,new ArrayList<>());

        System.out.println(charList);
        System.out.println(intList);
        System.out.println(boolList);
    }

    public static <T> List<T> arrayList(T[] array,List<T> list){
        for (T obj: array ) {
            list.add(obj);
        }
//        Collections.addAll(list,array);
        return list;
    }
}
