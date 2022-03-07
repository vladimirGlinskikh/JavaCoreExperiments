package stepic.usingStreamAPIWithCollections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StreamAPIWithCollectionExample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] parts = s.split(" ");

        List<String> list = new ArrayList<>();
        for (int i = 0; i < parts.length; i++) {
            list.add(parts[i]);
        }

        System.out.println(list.stream()
                .filter(str -> str.startsWith("J"))
                .map(p -> p.substring(1))
                .reduce((s1, s2) -> s2 + "\n" + s1)
                .get());
    }
}
