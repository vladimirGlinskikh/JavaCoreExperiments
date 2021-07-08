package functionalInterfaces.comparingObjects;

import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        Comparator<String> byConsonants = (x, y) ->
                removeVowels(x).compareTo(removeVowels(y));
        System.out.println(byConsonants.compare("Larry", "Libby"));
        System.out.println("-----------------");

        Comparator<Integer> byIntCompareTo = (x, y) -> x.compareTo(y);
        System.out.println(byIntCompareTo.compare(102, 102));
        System.out.println("-----------------");

        Comparator<Integer> byIntDifference = (x, y) -> x - y;
        System.out.println(byIntDifference.compare(100, 103));
        System.out.println("-----------------");

        Comparator<String> natural = Comparator.naturalOrder();
        System.out.println(natural.compare("Javac", "Jivac"));
        System.out.println("------------------");

        Comparator<String> reversed = Comparator.reverseOrder();
        System.out.println(reversed.compare("Java", "Jiva"));
        System.out.println("-------------------");

        System.out.println(Comparator.nullsFirst(byConsonants).compare("Java", null));
        System.out.println(Comparator.nullsLast(byConsonants).compare("Java", null));
        System.out.println("-------------------");

        System.out.println(byConsonants.reversed().compare("Java", "Jivac"));
    }

    public static String removeVowels(String s) {
        return s.replaceAll("[aeiou]", "");
    }
}
