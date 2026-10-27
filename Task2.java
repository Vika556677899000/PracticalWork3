package mnushko2;

import java.util.Scanner;

public class Task2 {

    public static int[] inputArray(Scanner scanner) {
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите " + n + " элементов:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void findMaxAdjacentSum(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Массив должен содержать минимум 2 элемента.");
            return;
        }

        int maxSum = arr[0] + arr[1];
        int maxIndex = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            int currentSum = arr[i] + arr[i + 1];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxIndex = i;
            }
        }

        System.out.println("Максимальная сумма соседних элементов: " + maxSum);
        System.out.println("Элементы в порядке возрастания индексов:");
        System.out.println("arr[" + maxIndex + "] = " + arr[maxIndex]);
        System.out.println("arr[" + (maxIndex + 1) + "] = " + arr[maxIndex + 1]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = inputArray(scanner);
        findMaxAdjacentSum(array);
        scanner.close();
    }
}