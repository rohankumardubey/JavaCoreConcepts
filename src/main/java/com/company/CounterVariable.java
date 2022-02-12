package com.company;

class StaticCounter{
    static int count;
    StaticCounter(){
        count++;
        System.out.println("count value "+count);
    }
}

class Counter{
    int count;
    Counter(){
        count++;
        System.out.println("count value "+count);
    }
}

public class CounterVariable {
    public static void main(String[] args) {
        StaticCounter sc1 = new StaticCounter();
        StaticCounter sc2 = new StaticCounter();
        StaticCounter sc3 = new StaticCounter();
        System.out.println("====================");
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

    }
}
