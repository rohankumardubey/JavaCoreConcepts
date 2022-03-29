package com.company.DataStructuresAndAlgorithms.Strings;

public class URLify {
    public static String url(String input,int limit){

        StringBuilder string = new StringBuilder();
        for (int i = 0; i < limit; i++) {
            string.append(input.charAt(i));
        }
        return string.toString().replace(" ","%20");

    }

    public static void main(String[] args) {
        System.out.println(url("Mr John Smith    ",13));
    }
}
