package stepic.rotateArectangleArray;

import java.util.Scanner;

public class Main {
    public static class Matrix {
        private int[][] array;
        private int width;
        private int height;

        Matrix(int height, int width) {
            this.width = width;
            this.height = height;
            this.array = new int[height][width];
        }

        private void setElement(int i, int j, int value) {
            array[i][j] = value;
        }

        Matrix rotateRight() {
            Matrix matrix = new Matrix(width, height);
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    matrix.setElement(j, height - 1 - i, array[i][j]);
                }
            }
            return matrix;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    builder.append(String.format("%s ", array[i][j]));
                }
                builder.append(System.lineSeparator());
            }
            return builder.toString();
        }

        public int getHeight() {
            return height;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        int height = in.nextInt();
        Matrix matrix = new Matrix(width, height);
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                matrix.setElement(i, j, in.nextInt());
            }
        }
        System.out.println(matrix.rotateRight());
    }
}
