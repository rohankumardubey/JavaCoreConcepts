package com.company.MultithreadFolderCleaner;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CleaningProcessorWithScheduleAtFixedRate {
    public static void main(String[] args) throws InterruptedException {

        CleaningScheduler clean= new CleaningScheduler();

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(clean,2,2,TimeUnit.SECONDS);

        service.awaitTermination(20,TimeUnit.SECONDS);

    }
}
