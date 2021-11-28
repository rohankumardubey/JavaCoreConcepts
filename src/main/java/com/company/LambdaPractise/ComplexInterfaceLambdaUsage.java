package com.company.LambdaPractise;

public class ComplexInterfaceLambdaUsage {
    public static void main(String[] args) {
        ComplexInterfaceLambda lambda = parameter -> {
            System.out.println("this is using lambda :"+ parameter);
        };

        lambda.printDefault("hii");

        lambda.printText("hi");

        ComplexInterfaceLambda.printStatic("text");
    }
}
