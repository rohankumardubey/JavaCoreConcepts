package com.company;


public class StringBuilderSample {
    public static void main(String[] args) {
        String entity="entity1";
        String tenant="tenant";
        String source="source";
        String destination="destination";

        StringBuilder sample =generateHashCode(entity,tenant,source,destination);
        System.out.println(sample);


    }

    public static StringBuilder generateHashCode(String ...unhashedValue){
        StringBuilder retrunValue= new StringBuilder();
        for(String value:unhashedValue){
            int temp=(value.hashCode() & 0xFFFFFFF)%9;
            retrunValue.append(temp);
        }
        return retrunValue;
    }

}
