package core.functionsAndModules;

public class Harmonic {
    public double harmonic(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++)
            sum += 1.0 / i;
        return sum;
    }
}
