package sololearn.numbersFrom1ToN;

import java.util.Scanner;

public class NumbersFromOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short num = sc.nextShort();
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
    }
}
