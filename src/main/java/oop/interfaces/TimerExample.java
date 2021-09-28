package oop.interfaces;

import javax.swing.*;

public class TimerExample {
    public static void main(String[] args) {
        var listener = new TimePrinter();
        var timer = new Timer(1000, listener);
        timer.start();
        JOptionPane.showMessageDialog(null, "Quit?");
        System.exit(0);
    }
}
