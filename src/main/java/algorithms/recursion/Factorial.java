package algorithms.recursion;

public class Factorial {

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            int f = n * factorial(n - 1);
            System.out.print(f + " ");
            return f;
        }
    }
}
