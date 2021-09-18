package javaRushAnswers.getDivisibleNumbers;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2,5,8,0,7,1,-4};
        getDivisibleNumbers(numbers, 2);
    }
    public static void getDivisibleNumbers(int[] numbers, int divider){
        for (int number : numbers) {
            if (number > 0) {
                if (number % divider == 0) {
                    System.out.println("int[] result = {" + number + "}");
                }
            }
        }
    }
}
