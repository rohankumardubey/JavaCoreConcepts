package com.company;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionUsing {
    public static void main(String[] args) {
        Collection<String> collect = List.of("/tmp/./nifi-standalone/values.yaml", "/tmp/./nifi-standalone/values1.yaml", "/tmp/./nifi-standalone/values2.yaml");
        parsing(collect);
        System.out.println(parsing(collect));
    }

    public static String parsing(Collection<String> collect) {
        StringBuilder str = new StringBuilder();
        if (!collect.isEmpty()) {
            Iterator<String> it = collect.stream().iterator();
            while (it.hasNext()) {
                String valuesYamlFileLocation=it.next();
                if(valuesYamlFileLocation != null && valuesYamlFileLocation.length() > 0){
                    str.append(" -f "+valuesYamlFileLocation);
                }
            }
            return str.toString();
        }
    return str.toString();
    }
}
