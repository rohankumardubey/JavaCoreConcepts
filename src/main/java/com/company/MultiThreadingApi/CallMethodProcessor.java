package com.company.MultiThreadingApi;

import java.util.concurrent.Callable;

public class CallMethodProcessor implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName()+ ": current thread data");
        return 1;
    }
}
