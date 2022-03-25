package com.company;

public class builderUsage {
    public static void main(String[] args) {
        BuilderName nifiStandalone = new BuilderName.CMnNiFiDeloySABuilder().deployName("deploy").limit("1").build();
        System.out.println(nifiStandalone);
    }
}
