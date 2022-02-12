package com.company.PropertiesUsage;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Object> propertiesUsage = SamplePropertyUsage.getDefaultConfig();
        System.out.println(propertiesUsage);
    }
}
