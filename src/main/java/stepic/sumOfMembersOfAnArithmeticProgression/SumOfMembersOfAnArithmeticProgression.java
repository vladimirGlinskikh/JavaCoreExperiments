package stepic.sumOfMembersOfAnArithmeticProgression;

import java.util.Scanner;

public class SumOfMembersOfAnArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sumP = sc.nextLong();
        long res = sumP * (sumP + 1) / 2;
        System.out.println(res);
    }
}
