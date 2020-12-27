package javaCodingProblems.stringsAndNumbers.applyingIndentation;

public class App {
    //    public static String days = "Sunday\n"
//            + "Monday\n"
//            + "Tuesday\n"
//            + "Wednesday\n"
//            + "Thursday\n"
//            + "Friday\n"
//            + "Saturday";


//    public static List<String> days = Arrays.asList("Sunday", "Monday", "Tuesday",
//            "Wednesday", "Thursday", "Friday", "Saturday");

    public static String html = "<html>";
    public static String body = "<body>";
    public static String h2 = "<h2>";
    public static String text = "Hello world!";
    public static String closeH2 = "</h2>";
    public static String closeBody = "</body>";
    public static String closeHtml = "</html>";


    public static void main(String[] args) {
//        System.out.println(days.indent(10));
//        for (int i = 0; i < days.size(); i++) {
//            System.out.print(days.get(i).indent(i));
//        }

//        days.stream()
//                .forEachOrdered(d -> System.out.print(d.indent(d.length())));

        System.out.println(html.indent(0)
                + body.indent(4)
                + h2.indent(8)
                + text.indent(12)
                + closeH2.indent(8)
                + closeBody.indent(4)
                + closeHtml.indent(0));
    }
}
