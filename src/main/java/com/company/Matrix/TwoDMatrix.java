package com.company.Matrix;

public class TwoDMatrix {
    public static void main(String[] args) {
        int twoD[][] = new int[3][3];
        int k=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                twoD[i][j]=k;
                k++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(twoD[i][j]+" ");
            }
            System.out.println();
        }
    }
}
