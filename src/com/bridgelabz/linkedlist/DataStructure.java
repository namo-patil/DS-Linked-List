package com.bridgelabz.linkedlist;

public class DataStructure {
    public static void main(String[] args) {
        // add data
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(70);
        linkedList1.add(30);
        linkedList1.add(56);
        linkedList1.print();

        // append data
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(56);
        linkedList2.append(30);
        linkedList2.append(70);
        linkedList2.print();

        // insert between
        LinkedList<Integer> linkedList3 = new LinkedList<>();
        linkedList3.add(70);
        linkedList3.add(56);
        linkedList3.insertBetween(30);
        linkedList3.print();
    }
}
