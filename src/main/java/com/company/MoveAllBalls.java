package com.company;


import java.util.ArrayList;
import java.util.List;

public class MoveAllBalls {

    public List<Integer> minOperations(String boxes){
        List<Integer> temp = new ArrayList<>();
        int count =0;

        for (int i = 0; i <boxes.length() ; i++) {
             count =0;
            for (int j = 0; j < boxes.length(); j++) {
                if(i!=j && boxes.charAt(j)=='1'){
                    count+=Math.abs(i-j);
                }
            }
            temp.add(count);

        }
        return  temp;
    }

    public static void main(String[] args) {
        String sample="001011";
        MoveAllBalls sol=new MoveAllBalls();
        System.out.println(sol.minOperations(sample));
    }
}
