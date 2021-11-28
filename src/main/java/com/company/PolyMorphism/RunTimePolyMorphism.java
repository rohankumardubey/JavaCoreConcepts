package com.company.PolyMorphism;

class A{
    public void display(){
        System.out.println("in A");
    }
}

class B extends A{
    public void display(){
        System.out.println("in B");
    }
}

class C extends A{
    public void display(){
        System.out.println("in C");
    }
}
public class RunTimePolyMorphism {
    public static void main(String[] args) {
        A a = new B();
        a.display(); // run time polymorphism

        a= new C();
        a.display(); // dynamic method dispatch


    }
}
