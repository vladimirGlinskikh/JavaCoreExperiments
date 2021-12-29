package javaRushAnswers.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class App {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        while (true) {
            if (string.isEmpty()) break;
            if (Files.isRegularFile(Path.of(string))) {
                System.out.println(string + THIS_IS_FILE);
                break;
            } else if (Files.isDirectory(Path.of(string))) {
                System.out.println(string + THIS_IS_DIR);
                break;
            } else {
                break;
            }
        }
    }
}
