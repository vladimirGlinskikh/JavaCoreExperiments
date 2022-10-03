package codewars.sumOfDigits;

public class DRoot {
    public static void main(String[] args) {
        System.out.println(digitalRoot(12345678));
    }

    public static int digitalRoot(int n) {
        int a = (n == 0) ? 0 : (n % 10) + digitalRoot(n / 10);
        return (a == 0) ? 0 : (a % 10) + digitalRoot(a / 10);
    }
}
