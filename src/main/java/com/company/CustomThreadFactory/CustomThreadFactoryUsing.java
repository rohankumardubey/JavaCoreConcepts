package com.company.CustomThreadFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CustomThreadFactoryUsing {
    public static void main(String[] args) {
        CustomThreadFactoryProcessor processor1 = new CustomThreadFactoryProcessor();
        CustomThreadFactoryProcessor processor2 = new CustomThreadFactoryProcessor();
        CustomThreadFactoryProcessor processor3 = new CustomThreadFactoryProcessor();

        CustomThreadFactory threadFactory = new CustomThreadFactory();

        ExecutorService service = Executors.newFixedThreadPool(2,threadFactory);

        service.submit(processor1);
        service.submit(processor2);
        service.submit(processor3);

        service.shutdown();
    }
}
