package stepic.checkingIfANumberIsPrime;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Main {
    public static boolean isPrime(final long number){
//        boolean probablyPrime = BigInteger.valueOf(number).isProbablePrime((int) Math.log(number));
//        return probablyPrime;

        return IntStream
                .range(2, Math.toIntExact(number))
                .noneMatch(i -> number % i == 0);
    }
    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }
}
