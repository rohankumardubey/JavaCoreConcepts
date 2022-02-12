package com.company;

public class ReferenceId {

    public void printDetails(){
        System.out.println(this);
    }
    public static void main(String[] args) {
        ReferenceId ref = new ReferenceId();
        System.out.println(ref);

        ref.printDetails();
    }
}
