package com.company.MutliThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyRunnable implements Runnable {

    public void deletezombie(List<Integer> list) {
        for (Integer lis : list) {
            delete(lis);

        }
    }

    @Override
    public void run() {

    }

    public void delete(Integer value) {
        boolean counter = true;
        Integer dump = value;
        while (counter) {
            System.out.println(dump + "==" + value);
            if (value <= 100) {
                value++;
            } else {
                counter = false;
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> sample = new ArrayList<>();
        sample.add(10);
        sample.add(20);
        sample.add(30);
        sample.add(40);
        sample.add(50);
        sample.add(60);

        MyRunnable eunn = new MyRunnable();


        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(2);

            executorService.execute(() -> {
                System.out.println(String.format("starting expensive task thread %s", Thread.currentThread().getName()));
                eunn.deletezombie(sample);
            });
        } finally {
            executorService.shutdown();
        }
    }


}