package com.company;

interface StringFunction {
    void show(String str);
}

public class LamdbaUsage {
    public static void main(String[] args) {
        StringFunction obj = i -> System.out.println("hi man "+i);
        obj.show("rohan");
    }
}
