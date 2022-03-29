package com.company.DataStructuresAndAlgorithms.LinkedList;

public class AddTwoLinkedList {
    Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void insert(int number) {
        Node newNode = new Node(number);
        if (head == null) {
            newNode.next = null;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            newNode.next = null;
            current.next = newNode;
        }
    }

    private void display() {
        Node pointer = head;
        while (pointer != null) {
            System.out.print(pointer.data + "->");
            pointer = pointer.next;

        }
        System.out.print("null");
    }

    private int length() {
        Node pointer = head;
        int counter = 0;
        while (pointer != null) {
            counter++;
            pointer = pointer.next;
        }
        return counter;
    }

    private int index(int index) {
        int MAX_SIZE = length();
        int[] array = new int[MAX_SIZE];
        Node pointer = head;
        int counter = 0;
        while (pointer != null) {
            array[counter] = pointer.data;
            counter++;
            pointer = pointer.next;
        }
        if (index < length()) {
            return array[index];
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        AddTwoLinkedList list1 = new AddTwoLinkedList();
        StringBuilder str1 = new StringBuilder();
        list1.insert(2);
        list1.insert(4);
        list1.insert(3);


        AddTwoLinkedList list2 = new AddTwoLinkedList();
        StringBuilder str2 = new StringBuilder();
        list2.insert(5);
        list2.insert(6);
        list2.insert(4);

        AddTwoLinkedList list3 = new AddTwoLinkedList();

        for (int i = 0; i < list1.length(); i++) {
            str1.append(list1.index(i));
        }

        for (int i = 0; i < list2.length(); i++) {
            str2.append(list2.index(i));
        }

        int result = Integer.parseInt(str1.toString()) + Integer.parseInt(str2.toString());

        while (result > 0) {
            list3.insert(result % 10);
            result = result / 10;

        }
        list3.display();

    }
}
