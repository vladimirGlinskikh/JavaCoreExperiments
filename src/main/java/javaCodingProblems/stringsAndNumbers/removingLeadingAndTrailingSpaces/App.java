package javaCodingProblems.stringsAndNumbers.removingLeadingAndTrailingSpaces;

public class App {
//    public static String text = "\n \n\n hello \t \n \r";
//    public static String trimmer = text.trim();

    public static char space = '\u2002';
    public static String text = space + "\n \n\n hello \t \n \r" + space;
    public static String stripped = text.strip();

    public static void main(String[] args) {
        System.out.println(text);
        System.out.println("------------------------");
//        System.out.println(trimmer);
        System.out.println(stripped);
    }
}
