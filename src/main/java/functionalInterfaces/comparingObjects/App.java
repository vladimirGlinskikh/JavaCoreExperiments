package functionalInterfaces.comparingObjects;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

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
        System.out.println("-------------------");

        Function<Student, Double> gpaKey = x -> x.gpa;
        Comparator<Student> byGpa = Comparator.comparing(gpaKey);
        Student s1 = new Student("Vladimir", 100, 3.39);
        Student s2 = new Student("Andrey", 103, 3.26);
        System.out.println(byGpa.compare(s1, s2));
        System.out.println("-------------------");

        Comparator<Student> byGpa2 = Comparator.comparing(x -> x.gpa);
        Comparator<Student> byId = Comparator.comparing(x -> x.id);
        System.out.println(byGpa2.compare(s1, s2));
        System.out.println(byId.compare(s1, s2));
        System.out.println("-------------------");

        Comparator<Student> byName = Comparator.comparing(x -> x.name);
        System.out.println(byName.compare(s1, s2));
        System.out.println("--------------------");

        ToDoubleFunction<Student> gpaKey2 = x -> x.gpa;
        System.out.println(Comparator.comparingDouble(gpaKey2).compare(s1, s2));
    }

    public static String removeVowels(String s) {
        return s.replaceAll("[aeiou]", "");
    }
}
