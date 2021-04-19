package stepic.translatingANumberFromDecimalToBinary;

import java.util.Scanner;

public class TranslatingANumberFromDecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String decimalToBinary = Integer.toBinaryString(num);
        System.out.println(decimalToBinary);
    }
}
