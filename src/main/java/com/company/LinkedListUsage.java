package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListUsage {
    public static void main(String[] args) {
        LinkedList<String> Sample = new LinkedList<String>();
        Sample.add("hi");
        Sample.add("how");
        Sample.add("are");
        Sample.add("you");
        Sample.add("doing");
        Sample.add("today");
        Sample.add("!!!!");

        Iterator<String> itr = Sample.iterator();
        ListIterator<String> Backitr = Sample.listIterator(Sample.size());
        System.out.println("forward iteration");
        System.out.println("------------------");

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println();
        System.out.println("Backword iteration");
        System.out.println("------------------");
        while(Backitr.hasPrevious()){
            System.out.println(Backitr.previous());
        }

    }
}
