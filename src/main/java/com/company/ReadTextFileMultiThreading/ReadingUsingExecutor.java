package com.company.ReadTextFileMultiThreading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExecutorCore implements Runnable{
    @Override
    public void run() {
        try(BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\rdubey\\OneDrive - MODEL N, INC\\Desktop\\JavaPractise\\src\\main\\java\\com\\company\\ReadTextFileMultiThreading\\Sample.txt")))){
            String line=null;
            while((line=reader.readLine())!=null){
                System.out.println(Thread.currentThread().getName()+" - "+line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class ReadingUsingExecutor {
    public static void main(String[] args) {
        ExecutorCore core1 = new ExecutorCore();
        ExecutorCore core2 = new ExecutorCore();
        ExecutorCore core3 = new ExecutorCore();

//        Executor executor = Executors.newSingleThreadExecutor();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.submit(core1);
        executor.execute(core2);
        executor.execute(core3);
        executor.shutdown();
    }
}
