package sololearn.multiplicitiesOfTheNumber;

import java.util.Scanner;

public class MultiplicitiesOfTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num/2; i++) {
            if (0 == num % i){
                System.out.print(i + " ");
            }
        }
        System.out.println(num);
    }
}
