package javaCodingProblems.stringsAndNumbers.convertingAStringIntoAnIntLongFloatOrDouble;

public class Test {
    private static final String TO_INT = "345";
    private static final String TO_LONG = "98234070926";
    private static final String TO_FLOAT = "34.876F";
    private static final String TO_DOUBLE = "13.83523D";

//    private static int toInt = Integer.parseInt(TO_INT);
//    private static long toLong = Long.parseLong(TO_LONG);
//    private static float toFloat = Float.parseFloat(TO_FLOAT);
//    private static double toDouble = Double.parseDouble(TO_DOUBLE);

    private static Integer toInt = Integer.valueOf(TO_INT);
    private static Long toLong = Long.valueOf(TO_LONG);
    private static Float toFloat = Float.valueOf(TO_FLOAT);
    private static Double toDouble = Double.valueOf(TO_DOUBLE);

    private static final String WRONG_NUMBER = "343q";

    public static void main(String[] args) {
//        System.out.println(toInt + "\n" + toLong + "\n" + toFloat + "\n" + toDouble);
        try {
            Integer toIntWrong1 = Integer.valueOf(WRONG_NUMBER);
            int toIntWrong2 = Integer.parseInt(WRONG_NUMBER);
        } catch (NumberFormatException e) {
            System.err.println(e);
        }
    }
}
