package com.company.DataStructuresAndAlgorithms.LinkedList;

// Java program to implement
// a Singly Linked List
public class SinglyLinkedList {
    Node head;
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void append(int number){
        Node new_node = new Node(number);
        if(head==null){
            new_node.next=null;
            head=new_node;
        }else{
            Node current = head;
            while(current.next!=null){
                current=current.next;
            }
            new_node.next=null;
            current.next=new_node;
        }
    }

    public void printlist(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }

    public void insertAtBegining(int number){
        Node new_node = new Node(number);
        if(head==null){
            new_node.next=null;
            head=new_node;
        }
        else{
            new_node.next=head;
            head=new_node;
        }
    }

    public int length(){
        Node current=head;
        int conut=0;
        while(current.next!=null){
            conut++;
            current=current.next;
        }
        return conut;
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.insertAtBegining(10);
        list.printlist();
        System.out.println("the lenght of linked list is :"+list.length());
    }
}
