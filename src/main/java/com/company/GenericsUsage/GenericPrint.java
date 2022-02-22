package com.company.GenericsUsage;

public  class GenericPrint {

    // Printing the generic type of the parameter.
    public static <T> void printGeneric(T t){
        System.out.println(t);
    }
    public static void main(String[] args) {
        printGeneric(1);
        printGeneric("hi");
        printGeneric(new Object());
    }
}
