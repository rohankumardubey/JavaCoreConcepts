package com.company.DataStructuresAndAlgorithms.ArrayUsage;

public class ShortestTraversal {
    public static int traverse(String[] list, int position, String value) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int clockwise = 0;
        int anticlockwise = 0;
        String[] input = {"apple", "ball", "cat", "dog"};
        int startPosition = 2;
        String element = "ball";
        if (traverse(input, startPosition, element) != -1) {
            clockwise = traverse(input, startPosition, element) - startPosition;
            anticlockwise = startPosition + (input.length - 1) - traverse(input, startPosition, element);
            System.out.println(Math.min(clockwise, anticlockwise));
        } else {
            System.out.println("element not present for searching ");
        }
    }
}
