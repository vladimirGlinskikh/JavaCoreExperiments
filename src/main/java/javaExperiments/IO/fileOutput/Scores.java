package javaExperiments.IO.fileOutput;

import java.util.Scanner;

public class Scores {
    public final int SENTINEL = -1;

    public static void main(String[] args) {
        new Scores().run();
    }

    public void run() {
        final String INPUT_PROMPT = "\nOn each line, enter a test score (or " +
                SENTINEL + " to quit): ";
        final String RESULT = "\n\nThe sum of the scores is: ";
        Scanner scanner = new Scanner(System.in);
        System.out.print(INPUT_PROMPT);
        int sum = addScores(scanner);
        System.out.println(RESULT + sum);
    }

    public int addScores(Scanner scanner) {
        int score, sum = 0;
        while (true) {
            score = scanner.nextInt();
            if (score == SENTINEL)
                break;
            sum += score;
        }
        return sum;
    }
}
