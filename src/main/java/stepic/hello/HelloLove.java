package stepic.hello;

import java.util.Scanner;

public class HelloLove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lineWord = sc.nextLine();

        if (lineWord.contains("Hello")) {
            System.out.print("Hi");
        }
        if (lineWord.contains("Love")) {
            System.out.print(" Love you too ");
        }
        if (lineWord.contains("Hello") && lineWord.contains("Love")) {
            System.out.print(" Hi, Love you too");
        }
    }
}
