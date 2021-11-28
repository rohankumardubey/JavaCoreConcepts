package com.company;

import java.util.Scanner;

public class ScannerUsage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Double a = getInput(sc);

        Double b = getInput(sc);

        System.out.println(a);
    }

    private static double getInput(Scanner sc) {
        System.out.println("enter number:");
        return sc.nextDouble();
    }
}
