package com.company.Streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsUsage {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        List<String> names = List.of("Reflection","Collection","Stream","Random","Ribbon","Rock");

        System.out.println(list.stream().map(x->x*x).collect(Collectors.toList()));
        System.out.println(names.stream().filter(s->s.startsWith("R")).collect(Collectors.toList()));
    }
}
