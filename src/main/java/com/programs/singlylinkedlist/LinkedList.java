package com.programs.singlylinkedlist;

public class LinkedList {
    public static void main(String[] args) {


        SinglyLinkedList.Node head = new SinglyLinkedList.Node(1);
        SinglyLinkedList linkedlist = new SinglyLinkedList(head);


        linkedlist.add(new SinglyLinkedList.Node(2));
        linkedlist.add(new SinglyLinkedList.Node(3));

        linkedlist.print();


        linkedlist.reverse();


        linkedlist.print();

    }
}
