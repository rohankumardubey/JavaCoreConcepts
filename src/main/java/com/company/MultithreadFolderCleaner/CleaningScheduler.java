package com.company.MultithreadFolderCleaner;

import java.io.File;

public class CleaningScheduler implements Runnable {
    @Override
    public void run() {
        File folders = new File("C:\\Users\\rdubey\\OneDrive - MODEL N, INC\\Desktop\\JavaPractise\\src\\main\\java\\com\\company\\ServerLogs");
        File[] files = folders.listFiles();
        for (File file : files) {
            if ((System.currentTimeMillis() - file.lastModified()) <= 5 * 60 * 1000) {
                System.out.println("Thread details: "+Thread.currentThread().getName()+" | file name which is deleted is :"+file.getName());
//                file.delete();
            }
            System.out.println("Thread details: "+Thread.currentThread().getName()+" | file name which is deleted is :"+file.getName());
        }
    }
}
