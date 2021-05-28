package algorithms.stack.reverse;

public class Reverser {
    private final String input;

    public Reverser(String in) {
        input = in;
    }

    public String doRev() {
        int stackSize = input.length();
        StackExample stack = new StackExample(stackSize);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);
        }
        StringBuilder output = new StringBuilder();
        while (!stack.isEmpty()) {
            char ch = stack.pop();
            output.append(ch);
        }
        return output.toString();
    }
}
