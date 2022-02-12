package javaRushAnswers.checkDomain;

public class CheckDomainExample {
    public static void main(String[] args) {
        System.out.println(checkDomain("zhelezyaka.com"));
    }

    public static String checkDomain(String url) {
        if (url.endsWith("com")) {
            return "com";
        } else if (url.endsWith(".net")) {
            return "net";
        } else if (url.endsWith(".org")) {
            return "org";
        } else if (url.endsWith(".ru")) {
            return "ru";
        } else return "неизвестный";
    }
}
