package com.company.ThreadSafety;

public class VolatileUsage {
    static volatile int a,b;

    public static void method1(){
        a++;
        b++;
    }
    public static void method2(){
        System.out.println("value of a : "+a+" value of b : "+b);
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(){
          public void run(){
              for (int i = 0; i < 10; i++) {
                  method1();
              }
          }
        };

        Thread t2 = new Thread(){
            public void run(){
                for (int i = 0; i < 10; i++) {
                    method2();
                }
            }
        };

        t1.setName("Thread A");
        t2.setName("Thread B");
        t1.start();
        t2.start();
    }
}
