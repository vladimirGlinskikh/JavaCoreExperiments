package stepic.floorSpaceOfTheRoom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String roomArea = scanner.nextLine();

        switch (roomArea) {
            case "triangle" -> {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double p = (a + b + c) / 2;
                System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
            }
            case "rectangle" -> {
                double a1 = scanner.nextDouble();
                double b1 = scanner.nextDouble();
                System.out.println(a1 * b1);
            }
            case "circle" -> {
                double r = scanner.nextDouble();
                System.out.println(3.14 * r * r);
            }
            default -> System.out.println("This is wrong area!");
        }
    }
}
