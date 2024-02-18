import java.util.*;

public class PriorityQueueAddAll {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue1 = new PriorityQueue<>();
        queue1.add(10);
        queue1.add(30);
        queue1.add(20);
        queue1.add(50);


        PriorityQueue<Integer> queue2 = new PriorityQueue<>();
        queue2.add(40);
        queue2.add(60);

        System.out.println("Original PriorityQueue 1: " + queue1);
        System.out.println("Original PriorityQueue 2: " + queue2);


        queue2.addAll(queue1);

        System.out.println("Modified PriorityQueue 2 after adding all elements from PriorityQueue 1: " + queue2);
    }
}
