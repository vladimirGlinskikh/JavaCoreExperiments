package string.replaceAll;

public class App {
    public static void main(String[] args) {
        String string = "Welcome to JavaExperiments";
        System.out.println("Original String: " + string);
        System.out.println("--------");
        String replace = string.replaceAll("to", "this is");
        System.out.println("New String: " + replace);
    }
}
