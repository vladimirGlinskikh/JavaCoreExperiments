package javaExperiments.collections.Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
//        System.out.println("main start");
//        c();
//        System.out.println("main end");

        Stack<String> stack = new Stack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");
        System.out.println("push(): " + stack);
//        while (!stack.isEmpty()){
//            System.out.println("pop(): " + stack.pop());
//            System.out.println(stack);
//        }
        System.out.println("peek(): " + stack.peek());
        System.out.println(stack);
    }

//    static void a() {
//        System.out.println("a start");
//        System.out.println("a end");
//    }
//
//    static void b() {
//        System.out.println("b start");
//        a();
//        System.out.println("b end");
//    }
//
//    static void c() {
//        System.out.println("c start");
//        b();
//        System.out.println("c end");
//    }
}
