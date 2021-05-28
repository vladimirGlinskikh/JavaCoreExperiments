package algorithms.stack.reverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        String input, output;
        while (true) {
            System.out.println("Enter a string: ");
            System.out.flush();
            input = getString();
            if (input.equals(""))
                break;
            Reverser reverser = new Reverser(input);
            output = reverser.doRev();
            System.out.println("Reversed: " + output);
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }
}
