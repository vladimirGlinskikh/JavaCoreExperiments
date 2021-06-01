package javaExperiments.streams;

public class SwitchExample {
    public static void main(String[] args) {
        int value = 734;
        System.out.println(
                switch (value) {
                    case 2, 3, 4 -> "2,3 or 4";
                    case 734 -> "Range: " + value;
                    case 0 -> "0";
                    default -> "Default";
                }
        );
    }
}
