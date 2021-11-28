package com.company.LambdaPractise;

import java.util.Comparator;

public class ComparatorUsage {
    public static void main(String[] args) {

        Comparator<String> comparing = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        int result = comparing.compare("one","two");
        System.out.println(result);

        Comparator<String> comparingUsingLambda = (o1,o2) -> o1.compareTo(o2);

        int lambdaResult = comparingUsingLambda.compare("one","two");
        System.out.println(lambdaResult);

    }
}
