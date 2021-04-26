package stackoverflowAnswers.formfactor;

import java.awt.*;

public class FormFactor {
    static ScanFile sf;
    static Scan.ScanFile1 search;
    private static Object x;

    public static void main(String[] args) {
        Panel panel = new Panel();
        panel.setVisible(true);
        ScanFile sf = new ScanFile();

        Scan.ScanFile1 search = new Scan.ScanFile1(); //Вот эта строка вызывает ошибку
        sf.start();
        search.start();
    }
}
