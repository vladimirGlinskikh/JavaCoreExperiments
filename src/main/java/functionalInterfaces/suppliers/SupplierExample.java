package functionalInterfaces.suppliers;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> generateInteger = () -> {
            Random random = new Random();
            return random.nextInt(100);
        };

        Supplier<String> generateString = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string: ");
            return scanner.nextLine();
        };

        System.out.println(generateInteger.get());
        System.out.println(generateInteger.get());
        System.out.println(generateString.get());
        System.out.println(generateString.get());
    }
}
