package com.company.MultiThreadingApi;

import java.util.concurrent.*;

public class ExecutorsServiceExecuteUsage {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<Integer> future = service.submit(new CallMethodProcessor());

        System.out.println("future value :"+future.get());

        service.shutdown();

        System.out.println("service status : is completed ? :"+service.awaitTermination(30, TimeUnit.SECONDS));

    }
}
