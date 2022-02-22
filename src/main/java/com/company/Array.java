package com.company;


public class Array {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 1;
        a[2] = 1;
        a[3] = 1;
        a[4] = 1;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println();
        int[] b = {1, 2, 3, 4, 5};
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
