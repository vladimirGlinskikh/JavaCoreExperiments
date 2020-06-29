package string.replaceAll;

public class App {
    public static void main(String[] args) {
        String string = "Welcome to JavaExperiments";
        System.out.println("Original String: " + string);
        System.out.println("--------");
        String replace = string.replaceAll(" ", "");
        System.out.println("New String: " + replace);
    }
}
