package core.arrays;

public class App {
    public static void main(String[] args) {
        double[] nums = {10.9, 23.2, 9.3, 45.2, 66.3};
        double result = 0;
        for (double num : nums) {
            result += num;
        }
        System.out.println("Среднее значение равно: " + result / nums.length);
    }
}
