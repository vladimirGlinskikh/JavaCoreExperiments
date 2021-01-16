package core.objectOrientedConcepts.inheritance;

import core.objectOrientedConcepts.dataAbstraction.anInterfaceAndAClassThatImplementsTheInterface.Company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class HourlyCompany extends Company {
    public static void main(String[] args) throws FileNotFoundException {
        new HourlyCompany().run();
    }

    protected HourlyEmployee getNextEmployee(Scanner scanner){
        Scanner lineScanner = new Scanner(scanner.nextLine());
        String name = lineScanner.next();
        int hoursWorked = lineScanner.nextInt();
        double payRate = lineScanner.nextDouble();
        return new HourlyEmployee(name, hoursWorked, payRate);
    }
}
