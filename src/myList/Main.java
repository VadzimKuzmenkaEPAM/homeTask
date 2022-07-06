package myList;

/*create a collection that is a singly linked list, provide methods
        for removing, adding, getting, and toString*/

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(10);
        myLinkedList.add(100);
        myLinkedList.add(1000);

        System.out.println(myLinkedList);

        myLinkedList.remove(2);
        System.out.println(myLinkedList.get(2));
    }
}
