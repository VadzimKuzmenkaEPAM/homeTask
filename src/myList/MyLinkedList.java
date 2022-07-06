package myList;

import java.util.Arrays;

public class MyLinkedList {
    private Node head; // the head of our list, when we create an object of the MyLinkedList class, will be null in this variable
    private int size;

    public void add(int value) { // the method returns nothing
        // if this is the first addition to the list and head is null, we need to initialize the variable
        if (head == null) { //
            this.head = new Node(value);
        } else {
            Node temp = head; // if the addition is not the first
            while (temp.getNext() != null) { // we have to reach the end of the list and the last node,
                temp = temp.getNext(); // specify a new node as the next node
            }
            temp.setNext(new Node(value)); // the last node is assigned a reference to the next node
        }
        size++; // increments the size of the sheet
    }

    public int get(int index) {
        int currentIndex = 0; // an indication of the current index. Because we will go through the sheet and count how much is left before the index is needed
        Node temp = head;

        while (temp != null) {
            if (currentIndex == index) {
                return temp.getValue(); // if we have reached the index we are looking for, then we take the current node and return the node value
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        try {
            throw new IllegalAccessException();
        } catch (IllegalAccessException e) { // if the index that is passed in the argument is larger than the size of the sheet, we throw an exception
            throw new RuntimeException(e);
        }
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.getNext();
            size--;
            return;
        }

        int currentIndex = 0;
        Node temp = head;

        while (temp != null) {
            if (currentIndex == index - 1) { //
                temp.setNext(temp.getNext().getNext()); // assign a node that is one away from the current one
                size--;
                return;
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
    }

    public String toString() {
        int[] result = new int[size]; // a temporary array of integers equal to the size of the list

        int idx = 0;
        Node temp = head;
        while (temp != null) { // iterate until there are nodes in the list
            result[idx++] = temp.getValue(); //
            temp = temp.getNext(); //each time we add the value of a new node

        }
        return Arrays.toString(result);
    }


    private static class Node {
        private Node next; // link to the next node
        private int value; // the value of the current node

        public Node(int value) {
            this.value = value;
        } // when building a new node, the value will be supplied to the constructor

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
