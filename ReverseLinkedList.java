import java.util.*;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        Iterator<Integer> descendingIterator = linkedList.descendingIterator();

        System.out.println("Linked List in Reverse Order:");
        while (descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next() + " ");
        }
    }
}
