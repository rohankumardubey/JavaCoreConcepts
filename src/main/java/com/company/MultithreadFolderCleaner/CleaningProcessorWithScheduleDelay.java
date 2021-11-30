package com.company.MultithreadFolderCleaner;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CleaningProcessorWithScheduleDelay {
    public static void main(String[] args) throws InterruptedException {

        CleaningScheduler clean= new CleaningScheduler();

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleWithFixedDelay(clean,2,2, TimeUnit.SECONDS);
        service.awaitTermination(20,TimeUnit.SECONDS);

    }

}
