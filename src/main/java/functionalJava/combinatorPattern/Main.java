package functionalJava.combinatorPattern;

import java.time.LocalDate;

import static functionalJava.combinatorPattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Vladimir",
                "vladimir@gmail.com",
                "+77014568967",
                LocalDate.of(1990, 1, 1));

//        System.out.println(new CustomerValidatorService().isValid(customer));

        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);
        System.out.println(result);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
