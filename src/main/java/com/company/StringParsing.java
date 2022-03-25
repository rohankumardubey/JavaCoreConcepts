package com.company;

import java.util.UUID;

public class StringParsing {
    public static void main(String[] args) {
        System.out.println(generateDeployment());
    }

    public static long getTotalRunTimeInMS() {
        return 10 * 60 * 1000;
    }
    public static String generateDeployment() {
        String deployName = null;
        UUID uuid = UUID.randomUUID();
        String newUuid = (Long.toString(uuid.getMostSignificantBits(), 36) + "-" + Long.toString(uuid.getLeastSignificantBits(), 36)).replace("--", "-");
        char replacingChar = '-';
        if (newUuid.charAt(0) == replacingChar) {
            deployName = "nifi-standalone" + "-" + newUuid.substring(1) + "-" +(getTimeOut() *3_600_000);
        } else {
            deployName = "nifi-standalone" + "-" + newUuid + "-" +(getTimeOut() * 3_600_000);
        }
        return deployName;
    }


    public static double getTimeOut() {
        double timeBound;
        if (getTotalRunTimeInMS() == -1) {
            timeBound = 48;
        } else {
            timeBound = (double) getTotalRunTimeInMS() / 3_600_000;
            System.out.println("time bound 1 "+timeBound);
            System.out.println("time bound 2 "+getTotalRunTimeInMS() / 3_600_000);
        }
        return timeBound;
    }
}
