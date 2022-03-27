package modernJava.streams.creatingADataStreamFromAnObjectThatAllowsForUndefinedValue;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> values =
                Stream.of("config", "home", "user", null)
                        .flatMap(key -> Stream.ofNullable(System.getProperty("config")))
                        .collect(Collectors.toList());

        System.out.println(values);
    }
}
