package com.company.AnnotationUsage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface CustomAnotation{
    int value();
    String naming() default "rohan";
}