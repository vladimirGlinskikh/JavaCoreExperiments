package javaExperiments.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String s = "Vladimir Glinskikh, Kazakhstan, Almaty, Lenin street, 34, Flat 12," +
                "email: vladimir.v@gmail.com, Postcode: AAD78, Phone number: +72342389234, email: v.glins@mail.ru";

//        Pattern pattern = Pattern.compile("\\w+");
//        Pattern pattern = Pattern.compile("\\b\\d{2}\\b");
//        Pattern pattern = Pattern.compile("\\+\\d{9}");
//        Pattern pattern = Pattern.compile("\\w+\\.\\w+@\\w+\\.(ru|com)");
//        Pattern pattern = Pattern.compile("\\b\\D{5,}\\b");
        Pattern pattern = Pattern.compile("\\s\\w{4,}\\w\\s");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
