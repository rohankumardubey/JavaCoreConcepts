package com.company.MultiThreadingApi;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceInvokeUsage {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService service = Executors.newSingleThreadExecutor();

        List<CallMethodProcessor> processors = new ArrayList<>();
        processors.add(new CallMethodProcessor());
        processors.add(new CallMethodProcessor());
        processors.add(new CallMethodProcessor());
        processors.add(new CallMethodProcessor());
        processors.add(new CallMethodProcessor());
        processors.add(new CallMethodProcessor());

       List<Future<Integer>> futures = service.invokeAll(processors);

       for(Future<Integer> future : futures ){
           System.out.println(future.get());
       }

       service.shutdown();
       service.awaitTermination(30, TimeUnit.SECONDS);
    }
}
