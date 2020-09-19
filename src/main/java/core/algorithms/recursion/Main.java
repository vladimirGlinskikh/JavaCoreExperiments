package core.algorithms.recursion;

public class Main {
    public static void main(String[] args) {
//        System.out.println(countDown(5));
        System.out.println(factorial(5));
    }

    public static int countDown(int i) {
        System.out.println(i);
        if (i <= 1) {
            return i;
        } else return countDown(i - 1);
    }

    public static int factorial(int x) {
        System.out.println(x);
        if (x == 1) {
            return 1;
        } else return x * factorial(x - 1);
    }
}
