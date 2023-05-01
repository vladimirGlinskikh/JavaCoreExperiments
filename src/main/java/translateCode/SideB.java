package translateCode;

import java.util.Random;
import javax.swing.*;
import java.awt.event.*;

public class SideB {
    // задаем значение переменной K
    static long K = 1234567890987654321L;
    // задаем значение переменной R
    static long R = 987654321012345678L;
    // задаем значение переменной A
    static long A = 0L;

    // метод XOR для выполнения операции XOR над переменными K и R
    public static long XOR(long K, long R) {
        // выполняем операцию XOR над K и R
        long result = K ^ R;
        return result;
    }

    public static void main(String[] args) {
        // создаем графический интерфейс для приложения
        JFrame frame = new JFrame("Аутентификация, сторона B");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // создаем элементы управления на форме
        JLabel labelK = new JLabel("K:");
        JTextField textFieldK = new JTextField(20);
        textFieldK.setText(Long.toString(K));
        JPanel panelK = new JPanel();
        panelK.add(labelK);
        panelK.add(textFieldK);

        JLabel labelR = new JLabel("R:");
        JTextField textFieldR = new JTextField(20);
        JPanel panelR = new JPanel();
        panelR.add(labelR);
        panelR.add(textFieldR);

        JLabel labelA = new JLabel("A:");
        JTextField textFieldA = new JTextField(20);
        JPanel panelA = new JPanel();
        panelA.add(labelA);
        panelA.add(textFieldA);

        // создаем кнопки на форме и добавляем им обработчики событий
        JButton buttonSetK = new JButton("Установить K");
        JButton buttonRandom = new JButton("Случайное число R");
        JButton buttonCheck = new JButton("Проверить A");
        JCheckBox checkBoxB = new JCheckBox("Сторона B");

        // обработчик нажатия на кнопку "Установить K"
        buttonSetK.addActionListener(e -> {
            // считываем значение из текстового поля для K
            String input = textFieldK.getText();
            // присваиваем значение переменной K
            K = Long.parseLong(input);
            // обновляем значение текстового поля
            textFieldK.setText(Long.toString(K));
            // выводим значение K в консоль
            System.out.println("K=" + K);
        });

        // обработчик нажатия на кнопку "Случайное число R"
        buttonRandom.addActionListener(e -> {
            // создаем объект класса Random
            Random rand = new Random();
            // генерируем случайное число R1
            long R1 = rand.nextInt(1000000000);
            // генерируем случайное число R2
            long R2 = rand.nextInt(1000000000);
            // объединяем R1 и R2 в переменную R
            R = R1 * 10000000000L + R2;
            // обновляем значение текстового поля для R
            textFieldR.setText(Long.toString(R));
        });

        // обработчик нажатия на кнопку "Проверить A"
        buttonCheck.addActionListener(e -> {
            // считываем значение K из текстового поля
            long K1 = Long.parseLong(textFieldK.getText());
            // считываем значение A из текстового поля
            long A1 = Long.parseLong(textFieldA.getText());
            // Считываем значение R из текстового поля
            long R1 = Long.parseLong(textFieldR.getText());

            // Вычисляем R2 с помощью функции XOR, используя K и A
            long R2 = XOR(K1, A1);

            if (R1 == R2) {
                // Если R1 равен R2, выводим сообщение об успешной аутентификации
                JOptionPane.showMessageDialog(null, "Аутентификация успешна");
            } else {
                // Иначе выводим сообщение об ошибке аутентификации
                JOptionPane.showMessageDialog(null, "ОШИБКА аутентификации");
            }
        });

        // Добавляем слушателя на флажок checkBoxB
        checkBoxB.addItemListener(e -> {
            // Если флажок выбран, выводим сообщение о том, что выбрана сторона B
            if (e.getStateChange() == ItemEvent.SELECTED) {
                System.out.println("Сторона B");
            }
        });

        // Создаем панель с кнопками и добавляем на нее кнопки и флажок
        JPanel panelButtons = new JPanel();
        panelButtons.add(buttonSetK);
        panelButtons.add(buttonRandom);
        panelButtons.add(buttonCheck);
        panelButtons.add(checkBoxB);

        // Создаем основную панель и устанавливаем на нее вертикальный BoxLayout
        JPanel panelMain = new JPanel();
        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
        // Добавляем на основную панель панели с текстовыми полями и кнопками
        panelMain.add(panelK);
        panelMain.add(panelR);
        panelMain.add(panelA);
        panelMain.add(panelButtons);

        // Добавляем основную панель на окно
        frame.add(panelMain);
        // Устанавливаем размер окна в соответствии с содержимым и отображаем его на экране
        frame.pack();
        frame.setVisible(true);
    }
}

