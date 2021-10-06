package functionalJava.functionalInterface;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("+7") && phoneNumber.length() == 12;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

    public static void main(String[] args) {
        System.out.println("Without predicate");
        System.out.println(isPhoneNumberValid("+70000000000"));
        System.out.println(isPhoneNumberValid("98700"));

        System.out.println("--------------------");

        System.out.println("With predicate");
        System.out.println(isPhoneNumberValidPredicate.test("+70000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("+70000000099"));
        System.out.println(isPhoneNumberValidPredicate.test("+70000099"));

        System.out.println("---------------------");

        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("+70000003000"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("+7003"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("+7"));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+7") && phoneNumber.length() == 12;
    }
}
