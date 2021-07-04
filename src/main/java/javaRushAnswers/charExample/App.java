package javaRushAnswers.charExample;

public class App {
    public static void main(String[] args) {
        char chByte = (byte)'a'; // так можем
        char chShort = (short)'a'; // так можем
        char chInt = (int)'a'; // так можем

        // так не можем уже потому, что максимум чар кастуется до инта
        //char chLong = (long)'a';
    }
}
