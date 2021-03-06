package com.company.Singelton;

public class ClassSingleton {
    private static ClassSingleton INSTANCE;
    private static String info;

    private ClassSingleton(){}

    public static ClassSingleton getInstance(){
        if(INSTANCE==null){
            INSTANCE= new ClassSingleton();
        }
        return INSTANCE;
    }

    public static String getInfo(){
        return ClassSingleton.info;
    }

    public static void setInfo(String info){
        ClassSingleton.info=info;
    }

    public static void setINSTANCE(ClassSingleton INSTANCE){
        ClassSingleton.INSTANCE=INSTANCE;
    }


}
