package com.company.Constructor;

public class SampleConstructorUsingThis {

    SampleConstructorUsingThis(){
        this("sample");
        System.out.println("default constructor");
    }

    SampleConstructorUsingThis(String sample){
        System.out.println(sample);
    }

    public static void main(String[] args) {

        SampleConstructorUsingThis sample = new SampleConstructorUsingThis();

    }
}
