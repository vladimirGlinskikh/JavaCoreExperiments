package core.dataTypesAndOperators.преобразованиеСтрокиВЦелоеЧисло;

public class Main {
    public static void main(String[] args) {
        String arg = "42";
        try {
            int value1 = Integer.parseInt(arg);
            Integer value2 = Integer.valueOf(arg);
            Integer value3 = Integer.decode("0x22");
            System.out.println(value1);
            System.out.println(value2);
            System.out.println(value3);
        } catch (NumberFormatException e) {
            System.err.println("invalid number format: " + arg + " : " + e);
        }
    }
}
