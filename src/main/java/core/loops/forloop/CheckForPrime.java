package core.loops.forloop;

public class CheckForPrime {
    public static void main(String[] args) {
        int num = 16;
        boolean isPrime;

        if (num < 2) {
            isPrime = false;
        } else {
            isPrime = true;
        }

        for (int i = 2; i <= num / i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not prime number");
        }
    }
}
