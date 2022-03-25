package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

public class randomGenerator {

    public static String generateDeployment(String timeLimit) {
        String deployName = null;
        UUID uuid = UUID.randomUUID();
        String newUuid = (Long.toString(uuid.getMostSignificantBits(), 36) + "-" + Long.toString(uuid.getLeastSignificantBits(), 36)).replace("--", "-");
        char replacingChar = '-';
        if (newUuid.charAt(0) == replacingChar) {
            deployName = "nifi-standalone" + "-" + newUuid.substring(1) + "-" + timeLimit;
        } else {
            deployName = "nifi-standalone" + "-" + newUuid + "-" + timeLimit;
        }
        return deployName;
    }

    public static void main(String[] args) {
        List<String> map = new ArrayList<>();
        HashSet<String > set = new HashSet<>();
        for (int i = 0; i < 1000000; i++) {
            int temp=100;
            String result = generateDeployment(String.valueOf(temp));
            map.add(result);
            set.add(result);
        }
        System.out.println(map.size());
        System.out.println(set.size());

    }
}
