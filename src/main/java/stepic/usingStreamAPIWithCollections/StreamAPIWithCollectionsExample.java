package stepic.usingStreamAPIWithCollections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPIWithCollectionsExample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        List<String> list = new ArrayList<>();

        while (true) {
            s = reader.readLine();
            if (s.equals(""))
                break;
            list.add(s);
        }

        Predicate<String> fn = (str) -> str.charAt(0) == 'J';

        Stream<String> stream = list.stream();
        Stream<String> onlyWithJ = stream.filter(fn)
                .peek((p) -> p.startsWith("J"))
                .map(p -> p.substring(1)).sorted();
        onlyWithJ.forEach(st -> System.out.println(st));
    }
}
