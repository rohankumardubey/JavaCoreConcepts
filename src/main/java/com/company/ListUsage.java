package com.company;

import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class ListUsage {
    public static void main(String[] args) {
        List<Integer> lis = Arrays.asList(1,2,3,4,5,6,7);

        System.out.println("position of number is : "+ Collections.binarySearch(lis,5));


    }
}
