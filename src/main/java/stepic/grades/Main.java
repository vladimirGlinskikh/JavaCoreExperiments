package stepic.grades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String parts = reader.readLine().replaceAll(" ", "");
        long numFromA = parts
                .chars()
                .mapToObj(ch -> (char) ch)
                .filter(a -> a == 'A')
                .count();

        System.out.println(numFromA > 0 ? (double) numFromA / (double) parts.length() : 0.0);
    }
}
