package com.company.MutliThreading;

public class UsingImplements implements Runnable{
@Override
    public void run(){
    System.out.println("thread id : "+Thread.currentThread().getId());
}

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread sample = new Thread(new UsingImplements());
            sample.start();
        }
    }
}
