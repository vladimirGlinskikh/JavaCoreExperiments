package core.collection.stack;

import java.util.Stack;

public class StackExample1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        System.out.println(stack);

//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//            System.out.println(stack);
//        }
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
