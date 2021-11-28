package com.company;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatValues {
    public static void main(String[] args) {


        var value = 10_000_000;
        var stringf = NumberFormat.getNumberInstance();
        System.out.println(stringf.format(value));

        var intf = NumberFormat.getNumberInstance();
        System.out.println(intf.format(value));

        var lo = Locale.getDefault();

        var strlo = NumberFormat.getNumberInstance(lo);
        System.out.println(strlo.format(value));


        lo = new Locale("in","IN");

        var currency = NumberFormat.getCurrencyInstance();
        System.out.println(currency.format(value));


    }
}
