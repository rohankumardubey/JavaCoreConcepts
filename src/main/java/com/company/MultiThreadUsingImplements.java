package com.company;

public class MultiThreadUsingImplements implements Runnable {
    @Override
    public void run(){
        System.out.println("this thread is : "+ Thread.currentThread().getId());
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Thread sample = new Thread(new MultiThreadUsingImplements());
            sample.start();
        }
    }
}
