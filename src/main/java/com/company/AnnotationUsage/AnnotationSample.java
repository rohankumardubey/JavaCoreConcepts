package com.company.AnnotationUsage;

import java.lang.reflect.Method;

public class AnnotationSample {
    public static void main(String[] args) throws NoSuchMethodException {

        AnnotationSample sample = new AnnotationSample();

        Method method = sample.getClass().getMethod("name");


        System.out.println(method.getAnnotation(CustomAnotation.class).value());
        System.out.println(method.getAnnotation(CustomAnotation.class).naming());
        name();

    }

    @CustomAnotation(value = 10)
    public static void name() throws NoSuchMethodException {
        AnnotationSample sample = new AnnotationSample();

        Method method = sample.getClass().getMethod("name");
        System.out.println(method.getAnnotation(CustomAnotation.class).value());
        System.out.println(method.getAnnotation(CustomAnotation.class).naming());
    }
}
