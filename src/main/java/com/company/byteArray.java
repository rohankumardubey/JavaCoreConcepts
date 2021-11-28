package com.company;

import java.util.Arrays;

public class byteArray {
    public static void main(String[] args) {
        byte[] result;

        String ad = "rohan";
        result=ad.getBytes();
        System.out.println(Arrays.toString(result));
    }
}
