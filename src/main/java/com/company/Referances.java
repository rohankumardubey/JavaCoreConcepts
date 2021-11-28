package com.company;


public class Referances {

    public static void primitiveReferences(int sample) {
        sample++;
        System.out.println("in method: " + sample);

    }

    public static void ComplexObjectsReferences(int[] sample) {
        sample[0]++;
        System.out.println("in method" + sample[0]);

    }

    public static void StringReferance(String s) {
        s = "new";

        System.out.println("in method: " + s);
    }


    public static void main(String[] args) {

        int a = 10;
        System.out.println("for primitive data types pass by copy takes place!!");
        System.out.println("before method:" + a);
        primitiveReferences(a);
        System.out.println("after method:" + a);

        System.out.println("-------------------");

        int[] b = {1, 2, 3};
        System.out.println("for complex data types(array or objects) pass by reference takes place!!");
        System.out.println("before method:" + b[0]);
        ComplexObjectsReferences(b);
        System.out.println("after method:" + b[0]);

        System.out.println("-------------------");

        String c = "hi";
        System.out.println("exception!!!!");
        System.out.println("for strings as it is immutable(complex data types) data " +
                "types pass by reference takes place but " +
                "new object is created and old object is " +
                "removed by garbage collector!!");
        System.out.println("before method:" + c);
        StringReferance(c);
        System.out.println("after method:" + c);


    }
}
