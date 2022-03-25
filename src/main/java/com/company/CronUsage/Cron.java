package com.company.CronUsage;


import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.scheduling.support.CronExpression;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class Cron {
    public static void main(String[] args) {
//        Date now = new Date();
//        long longTime = now.getTime() / 1000;
//        CronSequenceGenerator generator = new CronSequenceGenerator("*/10 * * * * *");
//        Date nextRunDate= generator.next(now);
//        System.out.println("Date:: " + nextRunDate);
//        System.out.println("present :"+longTime);
//        long convert = nextRunDate.getTime()/1000;
//        System.out.println("future  :"+convert);
//        System.out.println("difference :"+(convert-longTime)*1000);
//
//        System.out.println("==================");
//        /*
//        date to unix
//         */
//
//        long unixTimestamp = Instant.now().getEpochSecond();
//        long unixTime = System.currentTimeMillis() / 1000L;
//
//        System.out.println(unixTimestamp);
//        System.out.println(unixTime);

        LocalDateTime local = LocalDateTime.now();
        CronExpression generator = CronExpression.parse("0 0 0/6 * * ?");
        LocalDateTime sample = generator.next(local);
        System.out.println("present time :"+local);
        System.out.println("future run time :"+sample);
        Instant instant = sample.atZone(ZoneId.systemDefault()).toInstant();
        long timeInMillis = instant.toEpochMilli();
        System.out.println("present : "+local.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
        System.out.println("future : "+timeInMillis);
        System.out.println(ZoneId.systemDefault());
        System.out.println((timeInMillis-local.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()));
//        LocalDate nextRunDate = generator.next(LocalDate.now());
//        System.out.println("Date:: " + nextRunDate);
//        System.out.println("present :" + longTime);
//        long convert = nextRunDate.get()/1000;
//        System.out.println("future  :"+convert);
//        System.out.println("difference :"+(convert-longTime)*1000);
    }
}
