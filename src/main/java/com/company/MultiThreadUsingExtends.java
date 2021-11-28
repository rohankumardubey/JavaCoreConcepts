package com.company;

public class MultiThreadUsingExtends extends Thread {

    public void run() {
        System.out.println("this thread is :" + Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MultiThreadUsingExtends sample = new MultiThreadUsingExtends();
            sample.start();
        }
    }
}
