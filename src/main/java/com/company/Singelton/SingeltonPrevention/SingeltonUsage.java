package com.company.Singelton.SingeltonPrevention;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingeltonUsage {
    public static void main(String[] args) throws CloneNotSupportedException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SampleSingelton instance1 = SampleSingelton.getInstance();
        System.out.println(instance1.hashCode());

//        SampleSingelton instance2 = instance1.clone();
//        System.out.println(instance2.hashCode());

        SampleSingelton instance2;
        Constructor[] constructors = SampleSingelton.class.getConstructors();
        for(Constructor constructor : constructors){
            constructor.setAccessible(true);
            instance2=(SampleSingelton) constructor.newInstance();
            System.out.println(instance2.hashCode());
        }




    }
}
