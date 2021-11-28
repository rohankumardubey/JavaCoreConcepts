package com.company;

public class JvmMemory {
    public static void main(String[] args) {


        System.out.println("_________________________________");
        System.out.println("Max memory : "+Runtime.getRuntime().maxMemory());
        System.out.println("Total jvm memory : "+Runtime.getRuntime().totalMemory());
        System.out.println("Total free memory : "+Runtime.getRuntime().freeMemory());
        System.out.println("_________________________________");


    }
}
