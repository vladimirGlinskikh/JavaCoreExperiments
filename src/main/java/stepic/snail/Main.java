package stepic.snail;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();


        float n = ((float) (h - b) / (a - b));
        if (n % (Math.floor(n)) == 0) {
            System.out.println((int) (Math.floor(n)));
        } else {
            System.out.println((int) (Math.ceil(n)));
        }

    }
}
