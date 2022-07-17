package myList;

/*create a collection that is a singly linked list, provide methods
        for removing, adding, getting, and toString*/

public class Main {
    public static void main(String[] args) {
        CustomArrayList customArrayList = new CustomArrayList();
        customArrayList.add(0, 12);
        customArrayList.add(5, 14);
        customArrayList.add(3, 14);
        customArrayList.remove(2);
        System.out.println(customArrayList.size());
        System.out.println(customArrayList.get(5));
    }
}
