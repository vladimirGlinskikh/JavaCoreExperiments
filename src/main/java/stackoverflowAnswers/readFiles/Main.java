package stackoverflowAnswers.readFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> line;
        Path path = Paths.get("list.txt");

        try (Stream<String> stringStream = Files.lines(path)) {
            line = stringStream
                    .collect(Collectors.toList());
        }
        System.out.println(line);
    }
}
