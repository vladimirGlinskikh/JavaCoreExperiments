package string.replaceAll;

public class App {
    public static void main(String[] args) {
        String string = "Hello Java! This is the number: 12345";
        System.out.println("Original String: " + string);
        System.out.println("--------");
        String replace = string.replaceAll("[0-9]", "*");
        System.out.println("New String: " + replace);
    }
}
