package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsage {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }

        int removed = queue.remove();
        System.out.println("removed element is : "+removed);

        int find = queue.peek();

        System.out.println("first element is : "+find);

        queue.add(10);
        System.out.println(queue);

    }
}
