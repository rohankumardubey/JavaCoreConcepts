package com.company.JUnit;

import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.JUnitCore;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestJunit.class);
        System.out.println(result.getFailures());
        System.out.println(result.wasSuccessful());
        for(Failure fail : result.getFailures()){
            System.out.println(fail.toString());
        }
    }

}
