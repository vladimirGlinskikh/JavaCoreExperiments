package javaExperiments.collections;

import java.util.List;

public class App {
    public int sum(List<String> mixed) {
        final int DEFAULT_PARSED_INT = 0;
        try {
            int sum = 0;
            for (Object str : mixed) {
                sum += Integer.parseInt((String) str);
            }
            return sum;
        } catch (NumberFormatException e) {
            return DEFAULT_PARSED_INT;
        }
    }
}
