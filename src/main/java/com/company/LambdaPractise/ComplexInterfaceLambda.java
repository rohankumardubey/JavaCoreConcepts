package com.company.LambdaPractise;

public interface ComplexInterfaceLambda {
    void printDefault(String parameter);

    default void printText(String parameter){
        if(parameter.equals("hi"))
            System.out.println("printing hi");
        else
            System.out.println("cant display data");
    }

    static void printStatic(String parameter){
        System.out.println("this is static data");
    }
}
