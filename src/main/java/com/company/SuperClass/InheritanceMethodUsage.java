package com.company.SuperClass;


class Parent {
    public void display(){
        System.out.println("this is parent display method");
    }
}

class Child extends Parent {
    public void diaplay(){
        super.display();
        System.out.println("this is child display method");
    }
}

public class InheritanceMethodUsage {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
