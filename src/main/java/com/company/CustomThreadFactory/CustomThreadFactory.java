package com.company.CustomThreadFactory;

import java.util.concurrent.ThreadFactory;

public class CustomThreadFactory implements ThreadFactory{
    private static int counter=0;
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("Current thread - "+(++counter));
        return thread;
    }
}
