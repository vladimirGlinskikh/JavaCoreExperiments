package sololearn.timeConverter;

import java.time.Duration;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();

        converterDaysInSeconds(days);
    }

    private static void converterDaysInSeconds(int days) {
        Duration duration = Duration.ofDays(days);
        long totalSeconds = duration.getSeconds();
        System.out.println(totalSeconds);
    }
}
