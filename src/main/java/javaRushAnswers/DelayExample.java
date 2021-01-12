package javaRushAnswers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DelayExample {
    public static void main(String[] args) {

        ActionListener listener = new TimeShow();
        Timer timer = new Timer(2000, listener);
        timer.start();

        JOptionPane.showMessageDialog(null,
                "Остановить время и\n " +
                        "продолжить\n" +
                        "прокрастинировать?\n");
        System.exit(0);
    }
}

class TimeShow implements ActionListener {
    int count = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.print("Это тикает твое время," +
                " которого так ничтожно мало!\n"
                + "Человек в среднем живет всего 800_000 часов.\n"
                + "Всегда помни об этом неприятном моменте.\n");
        System.out.println(++count);
        Toolkit.getDefaultToolkit().getScreenSize();
    }
}
