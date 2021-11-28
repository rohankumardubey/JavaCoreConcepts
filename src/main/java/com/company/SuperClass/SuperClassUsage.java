package com.company.SuperClass;

class SuperClass{
    public SuperClass() {
        System.out.println("super class");
    }
}

class SubClass extends SuperClass{
    public SubClass(){
        System.out.println("sub class");
    }
}

public class SuperClassUsage {
    public static void main(String[] args) {
        SubClass sub = new SubClass();
    }
}
