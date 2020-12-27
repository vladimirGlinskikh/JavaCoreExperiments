package javaCodingProblems.stringsAndNumbers.transformingStrings;

public class TransformingString {
    public static void main(String[] args) {
        System.out.println(result);
    }
//    public static String resultMap = Stream.of("hello")
//            .map(s -> s + " Java! ")
//            .map(String::toUpperCase)
//            .map(s -> s.repeat(3))
//            .findFirst()
//            .get();

    public static String result = "hello"
            .transform(s -> s + " java! ")
            .transform(String::toUpperCase)
            .transform(s -> s.repeat(2));


}
