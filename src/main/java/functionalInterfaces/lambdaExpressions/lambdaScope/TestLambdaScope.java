package functionalInterfaces.lambdaExpressions.lambdaScope;

import functionalInterfaces.lambdaExpressions.fivoid.FIVoid;

public class TestLambdaScope {
    private static final int myField = 3;

    public static void main(String[] args) {
        int myLocal = 7;
        FIVoid lambdaVoid = x -> System.out.println(x + myField + myLocal);
        lambdaVoid.method1(5);
    }
}
