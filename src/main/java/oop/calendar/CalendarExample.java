package oop.calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);
        DayOfWeek weekDay = date.getDayOfWeek();
        int value = weekDay.getValue();

        System.out.println("Monday and other days");
        for (int i = 1; i < value; i++) {
            System.out.print(" ");
            while (date.getMonthValue() == month) {
                System.out.printf("%3d", date.getDayOfMonth());
                if (date.getDayOfMonth() == today)
                    System.out.print("*");
                else
                    System.out.print(" ");
                date = date.plusDays(1);
                if (date.getDayOfWeek().getValue() == 1)
                    System.out.println();
            }
            if (date.getDayOfWeek().getValue() != 1)
                System.out.println();
        }
    }
}
