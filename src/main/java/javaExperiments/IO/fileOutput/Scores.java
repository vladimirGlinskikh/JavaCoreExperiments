package javaExperiments.IO.fileOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
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
        PrintWriter printWriter = null;
        Scanner scanner = new Scanner(System.in);
        try {
            printWriter = new PrintWriter(new BufferedWriter(new FileWriter("/home/vg/Desktop/scores.txt")));
            System.out.print(INPUT_PROMPT);
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            int sum = addScores(scanner, printWriter);
            printWriter.println(RESULT + sum);
            printWriter.close();
        }
    }

    public int addScores(Scanner scanner, PrintWriter printWriter) {
        int score, sum = 0;
        boolean atLeastOneScore = false;
        while (true) {
            try {
                score = scanner.nextInt();
                if (score == SENTINEL)
                    break;
                printWriter.println(score);
                sum += score;
                atLeastOneScore = true;
            } catch (InputMismatchException e) {
                printWriter.println(e + " " + scanner.nextLine());
            }
        }
        if (!atLeastOneScore) {
            throw new RuntimeException("The input contains no legal scores. ");
        }
        return sum;
    }
}
