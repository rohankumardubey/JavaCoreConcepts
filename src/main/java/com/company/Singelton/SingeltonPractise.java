package com.company.Singelton;

public class SingeltonPractise {

    public static SingeltonPractise singleton;

    private SingeltonPractise(){
    }

    public  SingeltonPractise getInstance(){
        if(singleton ==null){
            singleton = new SingeltonPractise();
        }
        return singleton;
    }
}
