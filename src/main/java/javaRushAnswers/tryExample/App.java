package javaRushAnswers.tryExample;

import java.nio.file.Path;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        Path path1 = Path.of(str1);
        Path path2 = Path.of(str2);

        boolean relativizePath = false;
        try {
            path1.relativize(path2);
        } catch (IllegalArgumentException e) {
            relativizePath = true;
        }
        if (relativizePath) {
            try {
                path2.relativize(path1);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }
}
