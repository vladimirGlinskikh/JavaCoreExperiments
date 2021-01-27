package javaRushAnswers;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(reader.readLine());
//        int b = Integer.parseInt(reader.readLine());
//        int c = Integer.parseInt(reader.readLine());
//
//        while (!(a <= b && b <= c)) {
//            int value = a;
//            a = b;
//            b = c;
//            c = value;
//        }
//        System.out.println(b);
        System.out.print((int)Math.random() * 10 + 1);
    }

    public static double randChar(int lower, int higher) {
        return Math.random() * higher + lower;
    }
}
