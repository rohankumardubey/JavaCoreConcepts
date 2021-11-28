package com.company.DataStructuresAndAlgorithms.LinkedList;

public class SinglyLinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    public void printList(){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sample = new SinglyLinkedList();
        sample.head=new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        sample.head.next=second;
        second.next=third;
        third.next=null;
        sample.printList();
    }
}