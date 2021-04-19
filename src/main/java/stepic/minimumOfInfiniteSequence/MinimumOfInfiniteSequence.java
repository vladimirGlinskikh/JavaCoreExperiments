package stepic.minimumOfInfiniteSequence;

import java.util.Scanner;

public class MinimumOfInfiniteSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            if (a < min) {
                min = a;
            }
        }
        System.out.print(min);
    }
}
