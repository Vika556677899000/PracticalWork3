package mnushko2;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

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

    public static void printEvenOddSorted(int[] arr) {
        int n = arr.length;
        int[] even = new int[(n + 1) / 2];
        int[] odd = new int[n / 2];

        for (int i = 0, j = 0; i < n; i += 2, j++) {
            even[j] = arr[i];
        }
        for (int i = 1, j = 0; i < n; i += 2, j++) {
            odd[j] = arr[i];
        }

        Arrays.sort(even);
        Arrays.sort(odd);

        System.out.println("Элементы с чётными номерами (по возрастанию):");
        for (int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        System.out.println("Элементы с нечётными номерами (по возрастанию):");
        for (int i = 0; i < odd.length; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = inputArray(scanner);
        printEvenOddSorted(array);
        scanner.close();
    }
}