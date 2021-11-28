package com.company.ReadTextFileMultiThreading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class RunnableCore implements Runnable{
    @Override
    public void run() {
        try(BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\rdubey\\OneDrive - MODEL N, INC\\Desktop\\JavaPractise\\src\\main\\java\\com\\company\\ReadTextFile\\Sample.txt")))){
            String line=null;
            while((line=reader.readLine())!=null){
                System.out.println(Thread.currentThread().getName()+" - "+line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
public class ReadUsingRunnable {
    public static void main(String[] args) {
        RunnableCore core1 = new RunnableCore();
        RunnableCore core2 = new RunnableCore();
        RunnableCore core3 = new RunnableCore();

        Thread t1 = new Thread(core1);
        Thread t2 = new Thread(core2);
        Thread t3 = new Thread(core3);

        t1.start();
        t2.start();
        t3.start();
    }
}
