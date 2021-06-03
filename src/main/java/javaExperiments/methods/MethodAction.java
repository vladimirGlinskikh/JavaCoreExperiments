package javaExperiments.methods;

public class MethodAction {
    public int numberParser(int number, int[] numbers) {
        String string = String.valueOf(number);
        int length = string.length();
        for (int i = 0; i < length; ++i) {
            char code = string.charAt(i);
            int n = Character.digit(code, 10);
            numbers[i] = n;
        }
        return length;
    }
}
