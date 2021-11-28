package com.company.ReadTextFileMultiThreading;

import java.io.*;

class Core extends Thread{
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
public class ReadUsingThread {
    public static void main(String[] args) {
        Core core1 = new Core();
        Core core2 = new Core();
        Core core3 = new Core();

        core1.start();
        core2.start();
        core3.start();

    }
}
