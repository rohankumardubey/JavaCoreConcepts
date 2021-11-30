package com.company.CustomThreadFactory;

public class CustomThreadFactoryProcessor implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
