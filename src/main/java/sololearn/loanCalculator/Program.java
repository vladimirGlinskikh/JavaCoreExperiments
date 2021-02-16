package sololearn.loanCalculator;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            double percent = (amount / 10.0);
            sum = (int) (amount - percent);
            amount = sum;
        }
        System.out.println(sum);
    }
}
