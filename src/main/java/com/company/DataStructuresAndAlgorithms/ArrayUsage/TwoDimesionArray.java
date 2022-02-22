package com.company.DataStructuresAndAlgorithms.ArrayUsage;

public class TwoDimesionArray {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
//        int[][] a = new int[][]{{1,2},{3,4}};
//        int a[][] = {{1,2},{3,4}};

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=count;
                count++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
