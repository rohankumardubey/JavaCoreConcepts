package com.company.GenericsUsage;

import java.util.ArrayList;
import java.util.List;


// Creating a list of objects of different types.
public class GenericMethods {
    public static void main(String[] args) {
        Character[] cha = {'a','b','c'};
        Integer[] inte = {1,2,3,4,5};
        String[] str = {"ac","ac","av"};
        Boolean[] bool = {true,false};


        System.out.println(conversion(cha,new ArrayList<>()));
        System.out.println(conversion(inte,new ArrayList<>()));
        System.out.println(conversion(str,new ArrayList<>()));
        System.out.println(conversion(bool,new ArrayList<>()));
    }

    public static <T> List<T> conversion(T[] arr, List<T> lis){
        for(T a:arr){
            lis.add(a);
        }
        return lis;
    }
}
