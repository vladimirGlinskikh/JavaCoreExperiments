package stepic.theNumberOfTens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string;
        try {
            string = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (string.length() > 1) {
            System.out.println(string.charAt(string.length() - 2));
        } else {
            System.out.println(0);
        }
    }
}
