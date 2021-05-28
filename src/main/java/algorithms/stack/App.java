package algorithms.stack;

public class App {
    public static void main(String[] args) {
        StackExample stack = new StackExample(10);
        stack.push(23);
        stack.push(12);
        stack.push(6);
        stack.push(78);
        stack.push(36);
        stack.push(85);
        stack.push(100);

        while (!stack.isEmpty()) {
            long value = stack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println();
    }
}
