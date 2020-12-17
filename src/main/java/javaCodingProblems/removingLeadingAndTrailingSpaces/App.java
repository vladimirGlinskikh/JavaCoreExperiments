package javaCodingProblems.removingLeadingAndTrailingSpaces;

public class App {
    public static String text = "\n \n\n hello \t \n \r";
    public static String trimmer = text.trim();

    public static void main(String[] args) {
        System.out.println(text);
        System.out.println(trimmer);
    }
}
