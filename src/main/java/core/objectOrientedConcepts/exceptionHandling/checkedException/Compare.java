package core.objectOrientedConcepts.exceptionHandling.checkedException;

public class Compare {
    public static void main(String[] args) {
        new Compare().run();
    }

    public void run() {
        System.out.println(smaller(5.00, 4.00));
        System.out.println(smaller(5.00, 20.00));
    }

    public double smaller(double price1, double price2) {
        if (Math.abs(price1 - price2) > Math.min(price1, price2))
            throw new ArithmeticException("difference too large");
        return Math.min(price1, price2);
    }
}
