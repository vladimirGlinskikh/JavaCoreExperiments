package javaExperiments.regex;

import java.util.Arrays;

public class MatchesExample {
    public static void main(String[] args) {
        String s = "Vladimir Glinskikh, Kazakhstan, Almaty, Lenin street, 34, Flat 12," +
                "email: vladimir.v@gmail.com, Postcode: AAD78, Phone number: +72342389234, email: v.glins@mail.ru";
        String s1 = "regular@gmail.com";
        boolean result = s1.matches("\\w+@\\w+\\.(com|ru)");
        System.out.println(result);

        String[] array = s.split(" ");
        System.out.println(Arrays.toString(array));
    }
}
