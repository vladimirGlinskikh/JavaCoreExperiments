package javaExperiments.regex;

import java.util.regex.Pattern;

public class CheckIPExample {
    public static void main(String[] args) {
        String ip1 = "255.23.143.53";
        String ip2 = "234.789.23.12";
        CheckIPExample checkIPExample = new CheckIPExample();
        checkIPExample.checkIP(ip1);
        checkIPExample.checkIP(ip2);
    }

    void checkIP(String ip) {
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}+" +
                "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
        System.out.println(ip + " is ok? " + Pattern.matches(regex, ip));
    }
}
