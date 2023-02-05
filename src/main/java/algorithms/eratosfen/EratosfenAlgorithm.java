package algorithms.eratosfen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EratosfenAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

//    public static List<Integer> primesNumber(int max) {
//        boolean[] isPrime = new boolean[max];
//        Arrays.fill(isPrime, true);
//
//        for (int i = 0; i * i < max; i++) {
//            if (isPrime[i]) {
//                for (int j = 2 * i; j < max; j += i) {
//                    isPrime[j] = false;
//                }
//            }
//        }
//        ArrayList<Integer> primes = new ArrayList<>();
//        for (int i = 0; i < max; i++) {
//            if (isPrime[i]) {
//                primes.add(i);
//            }
//        }
//        return primes;
//    }

    private static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
