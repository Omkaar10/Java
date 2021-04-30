package com.LinkedList;

public class LinkedList {
    Node head;
    public void addNode(int element) {
        Node newNode = new Node(element);

        if(checkHead())
            head = newNode;
        else {
            Node tempNode = head;
            while(tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
    }

    public boolean checkHead() {
        return head == null;
    }

    public void printLinkedList() {
        Node tempNode = head;
        while(tempNode != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }
    }

    private void newHead(int element) {
        Node newHeadNode = new Node(element);
        newHeadNode.next = head;
        head = newHeadNode;
    }

    public void insertAt(int element,int indexPosition) {
        Node newNode = new Node(element);
        if(indexPosition == 0) {
            newHead(element);
        }
        else {
            Node tempNode = head;
            for(int i = 0; i < indexPosition-1; i++) {
                tempNode = tempNode.next;
            }
            newNode.next = tempNode.next;
            tempNode.next = newNode;
        }
    }

    private void removeHead() {
        head = head.next;
    }

    public void removeFrom(int indexPosition) {
        if(indexPosition == 0) {
            removeHead();
        }
        else {
            Node tempNode = head;
            Node toRemoveNode = null;
            for(int i = 0; i < indexPosition-1; i++) {
                tempNode = tempNode.next;
            }
            toRemoveNode = tempNode.next;
            tempNode.next = toRemoveNode.next;
        }
    }
}
