package core.functionsAndModules;

public class FindMaxElementBetweenArraysElements {
    public double maxElementArrays(double[] element) {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < element.length; i++) {
            if (element[i] > max)
                max = element[i];
        }
        return max;
    }
}
