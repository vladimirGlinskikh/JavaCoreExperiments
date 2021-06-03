package javaExperiments.methods;

public class App {
    public static void main(String[] args) {
        MethodAction methodAction = new MethodAction();
        int number = 198_123_957;
        int[] result = new int[10];
        int length = methodAction.numberParser(number, result);
        System.out.println(length);
        for (int i = 0; i < length; i++)
            System.out.printf("%d, ", result[i]);
    }
}
