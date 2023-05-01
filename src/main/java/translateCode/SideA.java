package translateCode;

import java.math.BigInteger;
import java.security.SecureRandom;
import javax.swing.*;

public class SideA {
    // Устанавливаем начальные значения для K, R и A
    private static long K = 1234567890987654321L;
    private static long R = 987654321012345678L;
    private static long A = 0;

    // Реализуем метод для операции XOR
    public static long XOR(long K, long R) {
        return K ^ R;
    }

    public static void main(String[] args) {
        // Создаем окно приложения
        JFrame frame = new JFrame("Аутентификация, сторона А");
        frame.setSize(430, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создаем панель для компонентов интерфейса
        JPanel panel = new JPanel();
        frame.add(panel);

        // Создаем текстовое поле для ввода значения K
        JTextField txtK = new JTextField("введи сюда ключ К");
        panel.add(txtK);

        // Создаем кнопку для установки значения K
        JButton setKBtn = new JButton("Установить ключ K");
        panel.add(setKBtn);

        // Создаем текстовое поле для ввода значения R
        JTextField txtR = new JTextField("вводи число сюда");
        panel.add(txtR);

        // Создаем текстовое поле для отображения значения R от стороны В
        JTextField randomRBtn = new JTextField("Вставь число R стороны В");
        panel.add(randomRBtn);

        // Создаем текстовое поле для отображения значения A
        JTextField txtA = new JTextField("скопируй это число");
        panel.add(txtA);

        // Создаем кнопку для выполнения операции XOR и установки значения A
        JButton encodeBtn = new JButton("Зашифровать ключом К");
        panel.add(encodeBtn);

        // Добавляем слушатель события для кнопки установки значения K
        setKBtn.addActionListener(e -> {
            try {
                // Получаем значение K из текстового поля и устанавливаем его
                K = Long.parseLong(txtK.getText());
                System.out.println("K=" + K);
            } catch (NumberFormatException ex) {
                // Выводим сообщение об ошибке, если значение K некорректно
                JOptionPane.showMessageDialog(frame, "Введите корректное значение K.");
            }
        });

        // Добавляем слушатель события для кнопки генерации случайного значения R
        randomRBtn.addActionListener(e -> {
            // Генерируем случайное число и устанавливаем его значение в текстовое поле
            SecureRandom secureRandom = new SecureRandom();
            byte[] bytes = new byte[16];
            secureRandom.nextBytes(bytes);
            BigInteger bigInteger = new BigInteger(1, bytes);
            long R = bigInteger.longValue();
            txtR.setText(String.valueOf(R));
        });

        // Добавляем слушатель события для кнопки выполнения операции XOR и установки значения A
        encodeBtn.addActionListener(e -> {
            try {
                // Получаем значения K и R из текстовых полей и вычисляем значение A
                K = Long.parseLong(txtK.getText());
                R = Long.parseLong(txtR.getText());
                A = XOR(K, R);
                txtA.setText(String.valueOf(A));
                // Если произошла ошибка формата числа при преобразовании строки в число
            } catch (NumberFormatException ex) {
                // Выводим сообщение об ошибке с помощью диалогового окна JOptionPane
                JOptionPane.showMessageDialog(frame, "Введите корректные значения K и R.");
            }
        });

        // Устанавливаем видимость окна на true, чтобы пользователь мог увидеть его содержимое
        frame.setVisible(true);
    }
}
