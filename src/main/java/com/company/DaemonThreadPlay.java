package com.company;

public class DaemonThreadPlay {
    public static void main(String [] args) {
        Thread daemonThread = new Thread(()-> {
                while (true) {
                    try {
                        System.out.println("Try block executed");
                        Thread.sleep(1000L);
                    } catch (Throwable t) {
                        t.printStackTrace();
                    }
                }
        });
        daemonThread.setDaemon(true);
        daemonThread.start();

        try {
            Thread.sleep(2500l);
        } catch (Throwable t) {
            System.out.println("catch");
        }
    }
}