package algorithms.stack.reverse;

public class StackExample {
    private final char[] stackArray;
    private int top;

    public StackExample(int max) {
        stackArray = new char[max];
        top = -1;
    }

    public void push(char j) {
        stackArray[++top] = j;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
