package com.company;

public class TryCatch {

    public static void main(String[] args) {
        String s = "";

        try {
            char a = s.charAt(1);

        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("null pointer exception:" + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("index out of bound:" + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("dont know the exception:" + e);
        }

        System.out.println("i am executed!!");
    }

}
