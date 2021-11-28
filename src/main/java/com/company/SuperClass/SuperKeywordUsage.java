package com.company.SuperClass;

class SuperClassSample{
    public SuperClassSample(){
        System.out.println("default super constructor");
    }

    public SuperClassSample(int i){
        System.out.println("super class constructor with integer parameter");
    }
}

class SubClassUsage extends SuperClassSample{
    public SubClassUsage(){
        super();
        System.out.println("default sub class constructor");
    }

    public SubClassUsage(int i){
        super(i);
        System.out.println("sub class with integer parameter");
    }
}
public class SuperKeywordUsage {
    public static void main(String[] args) {
       SubClassUsage sub = new SubClassUsage();
       SubClassUsage subb = new SubClassUsage(2);
    }
}
