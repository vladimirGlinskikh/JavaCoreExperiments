package sololearn.primitiveOperators;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int math = scanner.nextInt();
        int history = scanner.nextInt();
        int geometry = scanner.nextInt();

        int sum = math + history + geometry;
        int hours = sum % 600 / 60;
        int minutes = sum % 60;
        System.out.println(hours);
        System.out.println(minutes);
    }
}
