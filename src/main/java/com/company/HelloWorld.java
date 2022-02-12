package com.company;

public class HelloWorld {
    public static void checkStatus(long timeBound) throws InterruptedException {
        long millis = System.currentTimeMillis();
        timeBound=timeBound+millis;
        System.out.println("==================");
        System.out.println(timeBound);
        System.out.println("==================");
//        Thread.sleep(1000);
        while(millis<=timeBound){
            millis=System.currentTimeMillis();
            System.out.println("time : "+millis);
//            Thread.sleep(1000);
        }
        System.out.println("false");
    }
    public static void main(String[] args) throws InterruptedException {
        checkStatus(-1);
    }
}
