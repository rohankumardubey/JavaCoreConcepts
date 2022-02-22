package com.company.DataStructuresAndAlgorithms.StackUsage;

import java.util.*;

public class QueueUsingStack {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public void enque(int a){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(a);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int deque(){
        if(s1.isEmpty()){
            System.out.println("queue is empty");
            System.exit(0);
        }
        int x = s1.peek();
        s1.pop();
        return x;
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.enque(1);
        queue.enque(2);
        queue.enque(3);
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());

    }
}
