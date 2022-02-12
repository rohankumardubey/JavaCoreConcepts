package com.company.SystemEnvironments;

import java.lang.reflect.Field;
import java.util.Map;

public class SystemEnv {
    public static void main(String[] args) {
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println(javaHome);
        setEnv("hi","hi");
        System.out.println(System.getenv());
//        System.setenv("key","value")
    }

    public static void setEnv(String key, String value) {
        try {
            Map<String, String> env = System.getenv();
            Class<?> cl = env.getClass();
            Field field = cl.getDeclaredField("m");
            field.setAccessible(true);
            Map<String, String> writableEnv = (Map<String, String>) field.get(env);
            writableEnv.put(key, value);
        } catch (Exception e) {
            throw new IllegalStateException("Failed to set environment variable", e);
        }
    }
}
