package com.bridgelabz.linkedlist;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void append(T data){
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node<T> currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
    }
    public void insertBetween(T insertData){
        Node<T> newNode = new Node<>(insertData);
        head.next = newNode;
        newNode.next = tail;
    }

    public void print() {
        Node<T> currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
}
