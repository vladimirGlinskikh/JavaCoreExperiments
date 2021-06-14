package stepic.sizeOfParts;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int amount = scanner.nextInt();
            HashMap<Integer, Integer> details = new HashMap<>();
            while (amount > 0) {
                amount--;
                int input = scanner.nextInt();
                switch (input) {
                    case -1:
                    case 0:
                    case 1:
                        details.put(input, details.getOrDefault(input, 0) + 1);
                        break;
                    default:
                        break;
                }
            }
            System.out.println(details.getOrDefault(0, 0) +
                    " " + details.getOrDefault(1, 0) +
                    " " + details.getOrDefault(-1, 0));
        } catch (NumberFormatException e) {
            e.getStackTrace();
        }
    }
}
