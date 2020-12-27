package javaCodingProblems.stringsAndNumbers.countingVowelsAndConsonants;

import java.util.concurrent.TimeUnit;

public class Test {
    private static final String TEXT = "I love Java!";
    public static void main(String[] args) {
        System.out.println("Input text: \n" + TEXT + "\n");

        System.out.println("String.charAt() solution:");
        long startTime = System.nanoTime();

        Pair pair = Strings.countVowelAndConsonants(TEXT);

        displayExecutionTime(System.nanoTime() - startTime);
        System.out.println("Vowels: " + pair.vowels);
        System.out.println("Consonants: " + pair.consonants);

    }

    private static void displayExecutionTime(long time){
        System.out.println("Execution time: " + time + " ns" + " ("
                + TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms)");
    }
}
