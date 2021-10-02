package oop.lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class LambdaExample {
    public static void main(String[] args) {
        String[] planets = new String[]{
                "Mercury", "Venus", "Earth",
                "Mars", "Jupiter", "Saturn",
                "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(planets));

        Timer timer = new Timer(1000, event ->
                System.out.println("The time is " + new Date()));
        timer.start();
        JOptionPane.showMessageDialog(null, "Quit?");
        System.exit(0);
    }
}
