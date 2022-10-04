package codewars.fibonacci;

public class Xbonacci {
    public static void main(String[] args) {
        Xbonacci variobanacci = new Xbonacci();
        variobanacci.xbonacci(new double[]{1, 1, 1, 1}, 10);
        System.out.println(variobanacci);
    }

    public double[] xbonacci(double[] signature, int n) {
        double[] array = new double[n];
        if (n != 0) {
            final int size = Math.min(n, signature.length);
            System.arraycopy(signature, 0, array, 0, size);
            if (n > signature.length) {
                for (int i = signature.length; i < n; i++) {
                    double sum = 0;
                    for (int j = 1; j <= signature.length; j++)
                        sum += array[i - j];
                    array[i] = sum;
                }
            }
        }
        return array;
    }
}
