package com.company.DataStructuresAndAlgorithms.Recussion;

//Input: s = ["H","a","n","n","a","h"]
//        Output: ["h","a","n","n","a","H"]
public class reversingString {
    public static void main(String[] args) {
        char[] s = {'H','a','i'};
        reverseString(s);
    }
    public static void reverseString(char[] s) {
        char temp;
        if(s.length==0)
            System.out.println("-1");

        for (int i = 0; i <(s.length/2); i++) {
            temp=s[i];
            s[i]=s[(s.length-1)-i];
            s[(s.length-1)-i]=temp;
        }
        System.out.println(s);
    }
}
