package com.company.InnerClassDemo;

class Outer{
    int i;
    void show(){
        System.out.println("outer class");
    }

    class Inner{
        int j;
        void display(){
            System.out.println("inner class");
        }
    }

    static class InnerStatic{
        int k;
        void staticDisplay(){
            System.out.println("inner static class");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.show();

        //inner class
        Outer.Inner in = out.new Inner();
        in.display();

        //inner static class
        Outer.InnerStatic instatic = new Outer.InnerStatic();
        instatic.staticDisplay();

    }
}
