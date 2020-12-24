package javaCodingProblems.applyingIndentation;

import java.util.Arrays;
import java.util.List;

public class App {
    //    public static String days = "Sunday\n"
//            + "Monday\n"
//            + "Tuesday\n"
//            + "Wednesday\n"
//            + "Thursday\n"
//            + "Friday\n"
//            + "Saturday";
    public static List<String> days = Arrays.asList("Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday");

    public static void main(String[] args) {
//        System.out.println(days.indent(10));
        for (int i = 0; i < days.size(); i++) {
            System.out.print(days.get(i).indent(i));
        }
    }
}
