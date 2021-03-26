package javaExperiments.collections.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(5);
        deque.addFirst(7);
        deque.addFirst(3);
        System.out.println(deque);
        deque.addLast(9);
        deque.addLast(0);
        deque.addLast(1);
        System.out.println(deque);
    }
}
