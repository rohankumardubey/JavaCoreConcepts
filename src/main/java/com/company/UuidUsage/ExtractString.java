package com.company.UuidUsage;

import java.util.Arrays;

public class ExtractString {
    public static void main(String[] args) {
//        nifi-standalone-1naye0j4o68tv-1r8uct2w61bdc-1645466649163-5

      String[] str =  "nifi-standalone-1naye0j4o68tv-1r8uct2w61bdc-1645466649163-5".split("-");
//        System.out.println(str);
        String lastOne = str[str.length-1];
        String beforeOne = str[str.length-2];
        System.out.println(lastOne);
        System.out.println(beforeOne);
    }
}
