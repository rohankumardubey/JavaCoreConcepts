package com.company.DataStructuresAndAlgorithms.ArrayUsage;
//{1,2,3}-> {1,2,3}+{1} -> {1,2,4}
//{4,3,2,1}->{4,3,2,1}+{1}-> {4,3,2,2}
//{9}->{9}+{1}->{1,0}
//[9,8,7,6,5,4,3,2,1,0]

import java.util.Arrays;

public class PlusOne {
    public static int[] nonOptimisedExtraSpace(int[] array) {
        int counter = array.length-1;
        while(counter>=0){
            if(array[counter]==9){
                array[counter]=0;
            }
            else{
                array[counter]++;
                return array;
            }
            counter--;
        }

        if(array[0]==0){
            int[] result = new int[array.length+1];
            result[0]=1;
            return result;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] arr = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,9};

        System.out.println(Arrays.toString(nonOptimisedExtraSpace(arr)));
    }
}
