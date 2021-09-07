package stepic.theSumOfDigitsOfAThreeDigitNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        char[] n = String.valueOf(num).toCharArray();

        int one = Integer.parseInt(String.valueOf(n[0]));
        int two = Integer.parseInt(String.valueOf(n[1]));
        int three = Integer.parseInt(String.valueOf(n[2]));

        System.out.println(one + two + three);
    }
}
