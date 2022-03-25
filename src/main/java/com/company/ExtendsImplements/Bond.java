package com.company.ExtendsImplements;

public class Bond implements Contract {
    @Override
    public void sample() {
        System.out.println("this is sample from Bond class");
    }

    @Override
    public void tenure() {
        System.out.println("this is tenure from tenure class");
    }

}
