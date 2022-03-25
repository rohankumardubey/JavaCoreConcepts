package com.company;

import java.util.Calendar;
import java.util.concurrent.*;

public class SchedulerExecutorServiceExample {
    public static void main(String[] args)
    {
        System.out.println("Calender starts now!!"+Calendar.getInstance().get(Calendar.SECOND));

        ScheduledExecutorService schedule = Executors.newScheduledThreadPool(11);

        for (int i = 10; i >=0; i--) {
            schedule.schedule(new task(i),(i*10),TimeUnit.SECONDS);
        }
        schedule.shutdown();
    }


    static class task implements Runnable{
        int i;
        task(int i){
            this.i=i;
        }

        @Override
        public void run(){
            System.out.println("number :"+i +" time : "+Calendar.getInstance().get(Calendar.SECOND));
        }
    }
}
