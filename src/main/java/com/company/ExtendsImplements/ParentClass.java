package com.company.ExtendsImplements;

public interface ParentClass {
   default void trait(){
       System.out.println("this is a parent trait");
   }
}
