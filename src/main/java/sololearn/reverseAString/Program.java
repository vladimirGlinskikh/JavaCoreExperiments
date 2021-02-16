package sololearn.reverseAString;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();
        StringBuffer buffer = new StringBuffer(String.valueOf(arr));
        System.out.println(buffer.reverse());
    }
}
