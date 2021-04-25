package stepic.split;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SplitExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        System.out.println(line[0] + ":");

        IntStream.range(2, line.length)
                .mapToObj(i -> "-" + line[i]
                        .replace(",", ""))
                .forEach(System.out::println);
    }
}
