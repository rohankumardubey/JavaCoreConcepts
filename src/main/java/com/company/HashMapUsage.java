package com.company;

import java.util.HashMap;
import java.util.Map;

public class HashMapUsage {

    public static void main(String[] args) {
	// write your code here
        HashMap<Integer,String> map = new HashMap<>();//Creating HashMap
        map.put(1,"Mango");  //Put elements in Map
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");

        System.out.println("Iterating Hashmap...");

        for(HashMap.Entry<Integer,String> records : map.entrySet()){
            System.out.println(records);
        }

    }
}
