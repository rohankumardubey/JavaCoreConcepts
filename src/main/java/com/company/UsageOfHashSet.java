package com.company;

import java.util.*;

public class UsageOfHashSet {

    public static void main(String[] args) {


        List<EmployeeDetails> list = new ArrayList<>();
        list.add(new EmployeeDetails(1,"one"));
        list.add(new EmployeeDetails(2,"two"));
        list.add(new EmployeeDetails(3,"three"));
        list.add(new EmployeeDetails(4,"aa"));

        System.out.println(list);

        Collections.sort(list, new Comparator<EmployeeDetails>() {
            @Override
            public int compare(EmployeeDetails o1, EmployeeDetails o2) {
                return o1.Name.compareTo(o2.Name);
            }
        });
        System.out.println(list);
    }

}
