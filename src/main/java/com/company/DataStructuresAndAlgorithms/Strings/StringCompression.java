package com.company.DataStructuresAndAlgorithms.Strings;
//input aabcccccaaa
//output a2b1c5a3
public class StringCompression {
        public static String  compress(String sample) {
            StringBuilder str = new StringBuilder();
            int counter=1;
            for (int i = 0; i < sample.length()-1; i++) {
                if(sample.charAt(i)==sample.charAt(i+1)){
                    counter++;
                }
                else{
                    str.append(sample.charAt(i)).append(counter);
                    counter=1;
                }
            }
            str.append(sample.charAt(sample.length()-1)).append(counter);
            return str.toString();
        }

    public static void main(String[] args) {
        String sample = "aabcccccaaa";
        System.out.println(compress(sample));
    }
}
