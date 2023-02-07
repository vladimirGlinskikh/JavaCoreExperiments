package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        final String regex = "";
        final String string = "Мама, авТо, гриБ, Яблоко, яБлоко,ябЛоко, яблОко, яблоКо, яблокО, агент007, стриж, ГТО, Три богатыря\n\n";
        final String subst = "";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);

        final String result = matcher.replaceAll(subst);

        System.out.println(result);
    }
}