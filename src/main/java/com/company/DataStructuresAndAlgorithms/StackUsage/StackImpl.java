package com.company.DataStructuresAndAlgorithms.StackUsage;

public class StackImpl {
    private int[] arr;
    private int capacity;
    private int top;
    StackImpl(int size){
     arr = new int[size];
     capacity=size;
     top=-1;
    }

    public void push(int x){
        if(isFull()){
            System.out.println("stack overflow");
            System.exit(1);
        }

        arr[++top]=x;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            System.exit(1);
        }
        int temp=arr[top];
        arr[top]=0;
        return temp;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
       return  capacity==top+1;
    }

    public int size(){
        return top+1;
    }

    public void printStack(){
        for (int i = 0; i < capacity; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        StackImpl stack = new StackImpl(6);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.printStack();
        System.out.println();
        System.out.println(stack.pop());
        System.out.println();
        stack.printStack();
    }
}
