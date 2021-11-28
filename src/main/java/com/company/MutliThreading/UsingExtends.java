package com.company.MutliThreading;

public class UsingExtends extends Thread{
  public void run(){
      System.out.println("thread id: "+Thread.currentThread().getId());
  }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            UsingExtends sample = new UsingExtends();
            sample.start();
        }
    }
}
