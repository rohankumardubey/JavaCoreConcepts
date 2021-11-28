package com.company.ThreadSafety;

import java.util.concurrent.atomic.AtomicInteger;

class Counter{
    AtomicInteger count=new AtomicInteger();
    public  void increment(){
        count.incrementAndGet();
    }
}
public class AtomicVariableUsage {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(){
            public void run(){
                for (int i = 0; i < 10; i++) {
                    c.increment();
                }
            }
        };

        t1.setName("Thread - A");

        Thread t2 = new Thread(){
            public void run(){
                for (int i = 0; i < 10; i++) {
                    c.increment();
                }
            }
        };

        t2.setName("Thread - B");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
