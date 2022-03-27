package modernJava.streams.creatingADataStreamFromFiles;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        try (Stream<String> lines =
                     Files.lines(Paths.get("list.txt"),
                             Charset.defaultCharset())) {
            System.out.println(lines
                    .flatMap(line -> Arrays.stream(line.split(" ")))
                    .distinct()
                    .count());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
