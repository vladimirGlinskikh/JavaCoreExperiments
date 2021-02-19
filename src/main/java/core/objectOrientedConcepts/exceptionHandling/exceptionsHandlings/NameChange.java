package core.objectOrientedConcepts.exceptionHandling.exceptionsHandlings;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class NameChange {
    public String rearrange(String fullName) {
        String result;
        try {
            Scanner scanner = new Scanner(fullName);
            String firstName = scanner.next(),
                    middleName = scanner.next(),
                    lastName = scanner.next();
            result = lastName + ", " + firstName + " " + middleName.charAt(0) + ".";
        } catch (NoSuchElementException e) {
            result = e.toString() + ": " + ": The name is not of the form \" first-name " +
                    "middle-name last-name\"";
        }
        return result;
    }
}
