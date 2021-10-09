package functionalJava.combinatorPattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Vladimir",
                "vladimir@gmail.com",
                "+77014568967",
                LocalDate.of(1990, 1, 1));

        System.out.println(new CustomerValidatorService().isValid(customer));
    }
}
