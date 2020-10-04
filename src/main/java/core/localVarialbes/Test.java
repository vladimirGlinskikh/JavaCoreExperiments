package core.localVarialbes;

public class Test {
    public void run() {
        int k;
        boolean flag = true;
        if (flag)
            k = 20;
        else
            k = 21;
        System.out.println(isPrime(k));
    }

    public static boolean isPrime(int n) {
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int j = 3; j * j <= n; j += 2)
            if (n % j == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        new Test().run();
    }
}
