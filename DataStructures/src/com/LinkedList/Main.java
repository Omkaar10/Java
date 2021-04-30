package com.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addNode(12);
        ll.addNode(13);
        ll.addNode(100);
        ll.insertAt(34,0);
        ll.removeFrom(3);
        ll.printLinkedList();
    }
}
