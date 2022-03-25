package com.company.DataStructuresAndAlgorithms.QueueUsage;

public class QueueImpl {
    int[] arr ;
    int capacity;
    int top;
    int bottom;
    QueueImpl(int size){
        capacity=size;
        arr = new int[capacity];
        top=-1;
        bottom=-1;
    }

    public void push(int x){
        if(isFull()){
            System.out.println("queue is full");
            System.exit(1);
        }
        arr[++top]=x;
    }

    public boolean isFull(){
        return capacity==top+1;
    }

    public boolean isEmpty(){
        return top==-1 || bottom==top;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("queue is empty");
            System.exit(1);
        }
        int temp;
        if(bottom==-1){
            temp=arr[0];
            arr[0]=0;
            bottom=bottom+1;
            return temp;
        }
        temp=arr[++bottom];
        arr[bottom]=0;
        return temp;
    }

    public  void printQueue(){
        for (int i = 0; i < capacity; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        QueueImpl queue = new QueueImpl(3);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.printQueue();
        System.out.println("------------");
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println("------------");
        queue.printQueue();
    }
}
