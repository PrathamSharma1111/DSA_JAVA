import java.util.LinkedList;

public class LinkedList_Insertion {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<Number> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add(3);
        linkedList.add(6);
        linkedList.add(8);

        System.out.println("Original LinkedList: " + linkedList);
        linkedList.addFirst(1);
        System.out.println("LinkedList after adding at the beginning: " + linkedList);
        linkedList.add(2, 2);
        System.out.println("LinkedList after adding at index 2: " + linkedList);
        linkedList.addLast(9);
        System.out.println("LinkedList after adding at the end: " + linkedList);
    }
}