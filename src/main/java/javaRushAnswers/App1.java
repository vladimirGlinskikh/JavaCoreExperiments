package javaRushAnswers;

public class App1 {
    public static void main(String[] args) {
        int[] array = new int[5201];
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            if (i % 13 == 0) {
                array[i] = i;
                count++;
                System.out.print(i + " ");
                System.out.println(count);
            }
        }
    }
}
