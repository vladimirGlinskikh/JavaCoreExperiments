package core.objectOrientedConcepts.dataAbstraction.anInterfaceAndAClassThatImplementsTheInterface;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    private Company company;
    private FullTimeEmployee best;
    private Scanner scanner;
    private String expected;

    @BeforeEach
    public void runBeforeEveryTest() {
        company = new Company();
    }

    @Test
    public void getNextEmployeeTest() {
        scanner = new Scanner("Lucas 350.00");
        expected = "Lucas $350.00 HOURLY";
        assertEquals(expected, company.getNextEmployee(scanner).toString());
    }

    @Test
    public void findBestPaidTest() throws FileNotFoundException {
        scanner = new Scanner(new File("company.txt"));
        best = company.findBestPaid(scanner);
        expected = "c $140.00 HOURLY";
        assertEquals(expected, best.toString());
    }

    @Test
    public void findBestPaidTest2() throws FileNotFoundException {
        scanner = new Scanner(new File("company1.txt"));
        best = company.findBestPaid(scanner);
        assertEquals(null, best);
    }
}