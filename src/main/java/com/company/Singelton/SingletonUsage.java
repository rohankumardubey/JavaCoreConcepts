package com.company.Singelton;

public class SingletonUsage {
    public static void main(String[] args) {
        ClassSingleton singleton = ClassSingleton.getInstance();
        System.out.println(singleton);
        ClassSingleton.setINSTANCE(singleton);
        ClassSingleton.setInfo("this is info");
        System.out.println(ClassSingleton.getInfo());
    }
}