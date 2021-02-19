package core.objectOrientedConcepts.exceptionHandling.propogatingExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        new LeapYear().run();
    }

    public void run() {
        final String INPUT_PROMPT = "Please enter the year: ";
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            try {
                System.out.print(INPUT_PROMPT);
                System.out.println(isLeapYear(scanner));
            } catch (InputMismatchException e) {
                System.err.println("The input is not an integer.");
                scanner.nextLine();
            }
        }
    }

    public boolean isLeapYear(Scanner scanner) {
        final int FIRST_YEAR = 1582;
        int year = scanner.nextInt();
        if (year < FIRST_YEAR)
            throw new IllegalArgumentException();
        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0))
            return true;
        return false;
    }
}
