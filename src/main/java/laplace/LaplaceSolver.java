package laplace;

public class LaplaceSolver {
    public static void main(String[] args) {
        int gridSize = 4; // Размер сетки
        double[][] u = new double[gridSize][gridSize]; // Массив для хранения значений функции

        // Задание начальных значений функции
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                u[i][j] = 0.0;
            }
        }

        // Параметры краевых условий
        double yStep = 1.0 / (gridSize - 1);
        double xStep = 1.0 / (gridSize - 1);
        double pX = Math.PI;
        double pY = Math.PI;

        // Применение краевых условий на границах
        for (int i = 0; i < gridSize; i++) {
            // Граница AB
            u[i][0] = 30.0 * i * yStep;

            // Граница BC
            u[0][i] = 30.0 * Math.cos((pX * i * xStep) / 2.0);

            // Граница CD
            u[i][gridSize - 1] = 30.0 * Math.cos((pY * i * yStep) / 2.0);

            // Граница AD
            u[gridSize - 1][i] = 30.0 * i * xStep;
        }

        // Итерационный процесс
        double epsilon = 1e-6; // Порог сходимости
        double maxDiff;
        int maxIterations = 1000; // Максимальное число итераций
        int iteration = 0;

        do {
            maxDiff = 0.0;
            for (int i = 1; i < gridSize - 1; i++) {
                for (int j = 1; j < gridSize - 1; j++) {
                    double oldValue = u[i][j];
                    u[i][j] = (u[i - 1][j] + u[i + 1][j] + u[i][j - 1] + u[i][j + 1]) / 4.0;

                    // Проверка наибольшей разности между старым и новым значением
                    double diff = Math.abs(u[i][j] - oldValue);
                    if (diff > maxDiff) {
                        maxDiff = diff;
                    }
                }
            }
            iteration++;
        } while (maxDiff > epsilon && iteration < maxIterations);

        // Вывод результатов
        System.out.println("Примерное решение:");
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                System.out.print(u[i][j] + " ");
            }
            System.out.println();
        }
    }
}
