package com.company.Singelton;

public class SingletnUsage {
    public static void main(String[] args) {
        ClassSingleton singleton = ClassSingleton.getINSTANCE();
        ClassSingleton.setINSTANCE(singleton);
        ClassSingleton.setInfo("info for the instance");
        System.out.println(ClassSingleton.getInfo());
    }
}