package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String line = "Мама, авТо, гриБ, Яблоко, яБлоко," +
                " ябЛоко, яблОко, яблоКо, яблокО," +
                " агент007, стриж, ГТО, Три богатыря";
        final String regex = "\\b[а-яёa-z]*[А-ЯЁA-Z][а-яёa-z]*,";

        String[] array = line.split(regex);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);
        System.out.println("Ловим: ");
        while (matcher.find()) {
            System.out.print(line.substring(matcher.start(), matcher.end()));
        }
        System.out.println();
        System.out.println("Не ловим: ");
        for (String s : array) {
            System.out.print(s);
        }
    }
}