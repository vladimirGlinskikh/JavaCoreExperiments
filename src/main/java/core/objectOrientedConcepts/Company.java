package core.objectOrientedConcepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Company {
    public static void main(String[] args) throws FileNotFoundException {
        new Company().run();
    }

    public void run() throws FileNotFoundException {
        final String INPUT_PROMPT = "Please enter the path for the file of employees: ";
        final String BEST_PAID_MESSAGE = "\n\nThe best-paid employee (and gross pay) is ";
        final String NO_INPUT_MESSAGE = "\n\nError: There were no employees scanned in.";
        String fileName;
        System.out.print(INPUT_PROMPT);
        fileName = new Scanner(System.in).nextLine();
        Scanner scanner = new Scanner(new File(fileName));

        FullTimeEmployee bestPaid = findBestPaid(scanner);
        if (bestPaid == null)
            System.out.println(NO_INPUT_MESSAGE);
        else
            System.out.println(BEST_PAID_MESSAGE + bestPaid.toString());
    }

    public FullTimeEmployee findBestPaid(Scanner scanner) {
        FullTimeEmployee full,
                bestPaid = new FullTimeEmployee();
        while (scanner.hasNext()) {
            full = getNextEmployee(scanner);
            if (full.getGrossPay() > bestPaid.getGrossPay())
                bestPaid = full;
        }
        if (bestPaid.getGrossPay() == 0.00)
            return null;
        return bestPaid;
    }

    private FullTimeEmployee getNextEmployee(Scanner scanner) {
        Scanner lineScanner = new Scanner(scanner.nextLine());
        String name = lineScanner.next();
        double grossPay = lineScanner.nextDouble();
        return new FullTimeEmployee(name, grossPay);
    }
}
