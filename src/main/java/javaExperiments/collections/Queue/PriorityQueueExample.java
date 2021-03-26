package javaExperiments.collections.Queue;

import javaExperiments.collections.equalsAndHushCode.Student;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(7);
        queue.add(1);
        queue.add(5);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue);
    }
}
