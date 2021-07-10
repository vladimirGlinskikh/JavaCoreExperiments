package functionalInterfaces.comparingObjects;

import java.util.*;
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
        System.out.println("--------------------");

        Comparator<Student> byName1 = Comparator.comparing(x -> x.name);
        Comparator<Student> byId1 = Comparator.comparing(x -> x.id);
        Comparator<Student> byGpa1 = Comparator.comparing(x -> x.gpa);
        Student student1 = new Student("Vladimir", 1000, 3.45);
        Student student2 = new Student("Vladimir", 1000, 3.44);
        System.out.println(byName1.compare(student1, student2));
        System.out.println("-----------------------");

        Student student5 = new Student("Katy", 1008, 3.56);
        Student student6 = new Student("Vladimir", 1009, 3.56);
        System.out.println(byGpa1.thenComparing(x -> x.id).compare(student5, student6));
        System.out.println("------------------------");

        Student student7 = new Student("Roberto", 1009, 3.78);
        Student student8 = new Student("Roberto", 1010, 3.76);
        System.out.println(byName1.thenComparingDouble(x -> x.gpa).compare(student7, student8));
        System.out.println("-------------------------");

        List<Student> students = Arrays.asList(
                new Student("Vladimir", 1234, 3.54),
                new Student("Andrey", 1235, 4.54),
                new Student("Vasiliy", 1236, 3.52),
                new Student("Andrey", 1237, 3.59),
                new Student("Oleg", 1238, 5.54),
                new Student("Nikolay", 1239, 6.54)
        );

        Comparator<Student> byGpaCeil = Comparator.comparing(x -> x.gpa,
                (x, y) -> (int) (Math.ceil(x) - Math.ceil(y)));
        students.sort(byGpaCeil);
        students.forEach(x -> System.out.println(x));
        System.out.println("-------------------------");

        Student[] students1 = {
                new Student("Vladimir", 1234, 3.54),
                new Student("Andrey", 1235, 4.54),
                new Student("Vasiliy", 1236, 3.52),
                new Student("Andrey", 1237, 3.59),
                new Student("Oleg", 1238, 5.54),
                new Student("Nikolay", 1239, 6.54)
        };

        Comparator<Student> byGpaCeil1 = Comparator.comparing(x -> x.gpa,
                (x, y) -> (int) (Math.ceil(x) - Math.ceil(y)));
        Arrays.sort(students1, byGpaCeil1.thenComparing(x -> x.id).thenComparing(x -> x.name));
        for (Student s : students1)
            System.out.println(s);
        System.out.println("-------------------------");

        Comparator<String> byConsonats = (x, y) ->
                removeVowels(x).compareTo(removeVowels(y));
        TreeMap<String, String> pets = new TreeMap<>(byConsonats);
        pets.put("gerbil", "small cute rodents");
        pets.put("guinea pig", "rodents, not pigs");
        pets.put("cat", "have nine lives");
        pets.put("chicken", "more populous than people");
        pets.put("parrots", "smart birds");
        pets.forEach((x, y) -> System.out.println(x + ", " + y));

        Comparator<Map.Entry<String, String>> cmap =
                Map.Entry.comparingByKey();
        Map.Entry<String, String> cat = pets.ceilingEntry("cat");
        Map.Entry<String, String> chicken = pets.ceilingEntry("chicken");
        System.out.println(cmap.compare(cat, chicken));
    }

    public static String removeVowels(String s) {
        return s.replaceAll("[aeiou]", "");
    }
}
