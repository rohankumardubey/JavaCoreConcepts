package com.company.Wrapping;

public class WrappingSample {
    public static void main(String[] args) {
        int i=5;
        Integer a = new Integer(i); // boxing - wrapping
        int one = a.intValue(); // unboxing - unwrapping

        Integer b = i; //auto boxing
        int two=b; // auto unboxing




    }
}
