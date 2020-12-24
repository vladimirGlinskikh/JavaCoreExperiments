package javaCodingProblems.applyingIndentation;

public class App {
    public static String days = "Sunday\n"
            + "Monday\n"
            + "Tuesday\n"
            + "Wednesday\n"
            + "Thursday\n"
            + "Friday\n"
            + "Saturday";

    public static void main(String[] args) {
        System.out.println(days.indent(10));
    }
}
