package com.company.MultithreadFolderCleaner;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CleaningProcessorWithSchedule {
    public static void main(String[] args) throws InterruptedException {

        CleaningScheduler clean= new CleaningScheduler();

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        service.schedule(clean,5,TimeUnit.SECONDS);

        service.shutdown();
        service.awaitTermination(20,TimeUnit.SECONDS);

    }
}
