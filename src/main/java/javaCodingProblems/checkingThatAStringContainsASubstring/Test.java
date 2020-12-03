package javaCodingProblems.checkingThatAStringContainsASubstring;

public class Test {
    public static void main(String[] args) {
        String text = "I love Java!";
        String subtext = "av";
//        System.out.println(contains(text, subtext));
        boolean contains = text.contains(subtext);
        System.out.println(contains);
    }

//    public static boolean contains(String text, String subtext) {
//        return text.indexOf(subtext) != -1;
//    }
}
