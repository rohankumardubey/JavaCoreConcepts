package com.company;

public class HashCodeSample {
    public static void main(String[] args) {
        String sample = "rohan";
        System.out.println(sample.hashCode()%sample.length());
    }
}
