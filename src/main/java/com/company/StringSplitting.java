package com.company;

import org.w3c.dom.Node;

public class StringSplitting {
    public static void main(String[] args) {

        String bootStrapServer ="host1:9090";
        String[] tokens=bootStrapServer.split(";");
        for (int i = 0; i < tokens.length; i++) {
            String[] temp=tokens[i].split(":");
//            for (int j = 0; j < temp.length; j++) {
//                if(j%2==0){
//                System.out.println(temp[j]);
//                }
//                else{
//                    System.out.println("odd");
//                }
//            }

            String sample=tokens[i].split(":")[0];
            String sampl2=tokens[i].split(":")[1];
            System.out.println(sample+"-"+sampl2);
        }

    }
}
