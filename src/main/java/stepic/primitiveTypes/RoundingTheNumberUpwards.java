package stepic.primitiveTypes;

import java.util.Scanner;

public class RoundingTheNumberUpwards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long z = (long) Math.ceil(x / 3.0);
        System.out.println(z);
    }
}
