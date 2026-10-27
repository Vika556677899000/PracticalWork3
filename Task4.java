package mnushko2;

import java.util.Scanner;

public class Task4 {

    public static int[][] inputMatrix(Scanner scanner) {
        System.out.print("Введите размер квадратной матрицы N: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Введите элементы матрицы " + n + "x" + n + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void printCorners(int[][] matrix) {
        int n = matrix.length;
        int total = n * n;
        int count = 0;
        int layer = 0;

        System.out.println("Вывод матрицы уголками:");

        while (count < total) {
            for (int i = layer; i < n - layer && count < total; i++) {
                System.out.print(matrix[i][layer] + " ");
                count++;
            }
            for (int j = layer + 1; j < n - layer && count < total; j++) {
                System.out.print(matrix[n - layer - 1][j] + " ");
                count++;
            }
            layer++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = inputMatrix(scanner);
        printCorners(matrix);
        scanner.close();
    }
}