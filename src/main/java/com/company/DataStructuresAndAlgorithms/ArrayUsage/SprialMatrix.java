package com.company.DataStructuresAndAlgorithms.ArrayUsage;

import java.util.ArrayList;
import java.util.List;

public class SprialMatrix {
    public static List<Integer> spiralMatrix(int[][] arr) {
        int top=0;
        int bottom = arr.length-1;
        int left =0;
        int right = arr[0].length-1;
        int size = arr.length*arr[0].length;
        ArrayList<Integer> result = new ArrayList<>();
        while (result.size()<size){
            for (int i = left; i <=right ; i++) {
                result.add(arr[top][i]);
            }
            top++;
            for (int i = top; i <=bottom ; i++) {
                result.add(arr[i][right]);
            }
            right--;
            for (int i = right; i >=left ; i--) {
                result.add(arr[bottom][i]);
            }
            bottom--;
            for (int i = bottom; i >=top; i--) {
                result.add(arr[i][left]);
            }
            left++;
        }
        return result;

    }
    public static void main (String[] args){

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(spiralMatrix(arr));

    }
}
