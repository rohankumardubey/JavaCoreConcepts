package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class sam {
    public static Integer timeStampConversion(String timestamp){
        if(timestamp == null) return null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
            Date dt = sdf.parse(timestamp);
            long epoch = dt.getTime();
            return (int)(epoch/1000);
        } catch(ParseException e) {
            return null;
        }
    }
    public static void main(String[] args){
        System.out.println(sam.timeStampConversion("2022-02-24T19:48:17Z"));
//        System.out.println(sam.tsToSec8601("2017-07-01T14:59:55.711Z"));
    }
}
