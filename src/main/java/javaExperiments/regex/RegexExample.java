package javaExperiments.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String s = "Vladimir Glinskikh, Kazakhstan, Almaty, Lenin street, 34, Flat 12," +
                "email: vladimir.v@gmail.com, Postcode: AAD78, Phone number: +72342389234";

        Pattern pattern = Pattern.compile("[email]");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println("position: " + matcher.start() + " " + matcher.group());
        }
    }
}
