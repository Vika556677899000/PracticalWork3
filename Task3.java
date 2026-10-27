package mnushko2;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

    public static int[] inputArray(Scanner scanner, String name) {
        System.out.print("Введите размер массива " + name + ": ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите " + n + " элементов массива " + name + ":");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void swapArrays(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            a[i] = b[i];
            b[i] = temp;
        }
    }

    public static void printArray(String name, int[] arr) {
        System.out.println(name + ": " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = inputArray(scanner, "A");
        int[] b = inputArray(scanner, "B");

        System.out.println("\nДо обмена:");
        printArray("A", a);
        printArray("B", b);

        swapArrays(a, b);

        System.out.println("\nПосле обмена:");
        printArray("A", a);
        printArray("B", b);

        scanner.close();
    }
}