package com.company.UuidUsage;
import java.util.UUID;


public class UsingUuid {
    public static void main(String[] args) {

        System.out.println(UUID.randomUUID().toString()+"-"+System.currentTimeMillis());

        System.out.println("----------------------------------------------------------------");

        String s1 = ((Long.toString(UUID.randomUUID().getMostSignificantBits(), 36) +"-"+ Long.toString(UUID.randomUUID().getLeastSignificantBits(), 36)).replace("--","-")+"-" +System.currentTimeMillis()) ;
        System.out.println(s1);
        System.out.println("----------------------------------------------------------------");
        if(s1.charAt(0)=='-'){
            System.out.println(s1.substring(1));
        }
        else {
            System.out.println(s1);
        }

    }
}
