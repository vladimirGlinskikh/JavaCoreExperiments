package functionalInterfaces.lambdaExpressions.fivoid;

public class App {
    public static void main(String[] args) {
        FIVoid lambdaVoid = System.out::println;
        lambdaVoid.method1(7);
    }
}
