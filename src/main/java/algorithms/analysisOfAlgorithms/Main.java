package algorithms.analysisOfAlgorithms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int a1 = a + b + c;
        int b1 = a * b * c;
        int c1 = (a + b) * c;
        System.out.println(a + " + " + b + " + " + c + " =  " + a1);
        System.out.println(a + " * " + b + " * " + c + " = " + b1);
        System.out.println("(" + (a + " + " + b) + ") * " + c + " = " + c1);
    }
}