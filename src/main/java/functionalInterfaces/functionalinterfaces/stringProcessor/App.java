package functionalInterfaces.functionalinterfaces.stringProcessor;

public class App {
    public static void main(String[] args) {
        StringProcessor toLowerCase = String::toLowerCase;
        StringProcessor toUpperCase = String::toUpperCase;

        String s = toLowerCase.process("HELLOFUNCTIONALINTERFACES");
        System.out.println(s);
        System.out.println("Lower case: " + StringProcessor.isLowerCase(s));
        System.out.println("Upper case: " + StringProcessor.isUpperCase(s));

        String s1 = toUpperCase.process(s);
        System.out.println("\n" + s1);
        System.out.println("Lower case: " + StringProcessor.isLowerCase(s1));
        System.out.println("Upper case: " + StringProcessor.isUpperCase(s1));
    }
}
