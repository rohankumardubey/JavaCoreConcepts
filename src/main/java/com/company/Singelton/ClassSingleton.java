package com.company.Singelton;

public class ClassSingleton {
    private static ClassSingleton INSTANCE;
    private static String Info;

    private ClassSingleton(){}

    public static ClassSingleton getINSTANCE(){
        if(INSTANCE==null){
            INSTANCE=new ClassSingleton();
        }
        return INSTANCE;
    }

    public static String getInfo(){
        return ClassSingleton.Info;
    }

    public static void setInfo(String Info){
        ClassSingleton.Info=Info;
    }

    public static void setINSTANCE(ClassSingleton INSTANCE){
        ClassSingleton.INSTANCE=INSTANCE;
    }

}
