package com.company.ThreadSafety;

class Core {
    synchronized void sum(int m) {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            System.out.println("thread name :" + t.getName() + " sum :" + (m + i));
        }
    }
}


class Main extends Thread {
    Core core = new Core();

    public void run() {
        core.sum(1);
    }
}


public class SynchronizeThread {
    public static void main(String[] args) {

        Main sample = new Main();

        Thread t1 = new Thread(sample);
        t1.setName("Thread - A");
        Thread t2 = new Thread(sample);
        t2.setName("Thread = B");

        t1.start();
        t2.start();
    }
}


