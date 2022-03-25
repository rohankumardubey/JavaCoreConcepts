package com.company.ExtendsImplements;

public class Template implements Contract{
    @Override
    public void sample() {
        System.out.println("this is sample from Template class");
    }

    @Override
    public void tenure() {
        System.out.println("this is tenure from Template class");
    }

    @Override
    public void trait() {
        System.out.println("this is trait from Template class");
    }
}
