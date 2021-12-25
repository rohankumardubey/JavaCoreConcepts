package com.company.JavCodingChallanges;

public class PasswordComplexity {
    public static void main(String[] args) {
        System.out.println(isPasswordComplex("rohan"));
    }

    private static Boolean isPasswordComplex(String password){
        return password.length() >= 6 && !(password.contentEquals(password.toUpperCase())) && !(password.contentEquals(password.toLowerCase())) && (password.contains("0") ||
                password.contains("1") || password.contains("2") || password.contains("3") ||
                password.contains("4") || password.contains("5") || password.contains("6") ||
                password.contains("7") || password.contains("8") || password.contains("9"));
    }
}
