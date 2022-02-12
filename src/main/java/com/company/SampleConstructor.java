package com.company;

public class SampleConstructor {

    SampleConstructor(){
        System.out.println("this is default constructor");
    }

    SampleConstructor(int a){
        this();
        System.out.println("this is second constructor");
    }

    public static void main(String[] args) {
        SampleConstructor sample = new SampleConstructor(2);

    }
}
