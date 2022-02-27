package javaRushAnswers.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static ArrayList<Integer> divBy3 = new ArrayList<>();
    public static ArrayList<Integer> divBy2 = new ArrayList<>();
    public static ArrayList<Integer> others = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            numbers.add(Integer.parseInt(s));
        }

        for (int i = 0; i < 20; i++) {
            Integer x = numbers.get(i);
            if (x % 2 == 0 && x % 3 == 0) {
                divBy3.add(x);
                divBy2.add(x);
            } else if (x % 3 == 0) {
                divBy3.add(x);
            } else if (x % 2 == 0) {
                divBy2.add(x);
            } else {
                others.add(x);
            }
        }
        printList(divBy3);
        printList(divBy2);
        printList(others);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer x : list) {
            System.out.println(x);
        }
    }
}
