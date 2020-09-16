package core.algorithms.stdOut;

public class FormatExample {
    public static void main(String[] args) {
        int d = 512;
        double f = 1595.1680010754388;
        String s = "Hello, Format";

        System.out.printf("%14d\n", d);
        System.out.printf("%-14d\n", d);

        System.out.printf("%14.2f\n", f);
        System.out.printf("%.7f\n", f);
        System.out.printf("%14.4e\n", f);

        System.out.printf("%14s\n", s);
        System.out.printf("%-14s\n", s);
        System.out.printf("%-14.5s\n", s);
    }
}
