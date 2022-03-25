package com.company.DataStructuresAndAlgorithms;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionsUsage {
    public static void main(String[] args) {
        Sample sample1 = new Sample("hi", 1);
        Sample sample2 = new Sample("how", 2);
        Sample sample3 = new Sample("are", 3);

        Collection<Sample> collect = List.of(sample1, sample2, sample3);

        System.out.println(new CollectionsUsage().returnValue(collect));

        new CollectionsUsage().printElement(collect);


    }

    public int returnValue(Collection<Sample> collect) {
        return collect.stream().mapToInt(Sample::getNumber).sum();
    }

    public void printElement(Collection<Sample> collect) {
        Iterator<Sample> sample = collect.stream().iterator();
        while (sample.hasNext()) {
            System.out.println(sample.next().toString());
        }
    }

}

class Sample {
    int number;
    String name;

    Sample(String name, int number) {
        this.name = name;
        this.number = number;
    }

    void setName(String name) {
        this.name = name;
    }

    void setNumber(int number) {
        this.number = number;
    }

    String getName() {
        return this.name;
    }

    int getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return "sample: " + this.getNumber() + ":" + this.getNumber();
    }

}
