package javaExperiments.collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        queue.add("Four");
        System.out.println("add(): " + queue);
        System.out.println("----------------------");

        queue.offer("One");
        queue.offer("Two");
        queue.offer("Three");
        queue.offer("Four");
        System.out.println("offer(): " + queue);
        System.out.println("----------------");

        queue.remove();
        System.out.println("remove(): " + queue);
        System.out.println("-------------");

        System.out.println("poll(): " + queue.poll());
        System.out.println("------------------");

        System.out.println("element(): " + queue.element());
        System.out.println("-------------------");

        System.out.println("peek(): " + queue.peek());
        System.out.println("----------------");
    }
}
