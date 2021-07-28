package modernJava.lambdas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static String processFile(BufferedReaderProcessor processor) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("pom.xml"))) {
            return processor.process(bufferedReader);
        }
    }

    public static void main(String[] args) throws IOException {
        String oneLine = processFile((BufferedReader br) -> br.readLine());
        System.out.println(oneLine);
    }
}

