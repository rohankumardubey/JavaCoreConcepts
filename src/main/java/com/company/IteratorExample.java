package com.company;

import java.util.Arrays;
//import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("hi","how","are","you","doing");
        Iterator<String> str = list.listIterator();
        while(str.hasNext()){
            System.out.println(str.next());
        }

    }
}
