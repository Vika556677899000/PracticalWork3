package mnushko2;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

    public static boolean validateN(int n) {
        if (n <= 0) {
            System.out.println("Ошибка: N должно быть больше 0.");
            return false;
        }
        return true;
    }

    public static double inputA(Scanner scanner) {
        double a = 0;
        boolean ok = false;
        while (!ok) {
            System.out.print("Введите вещественное число A: ");
            if (scanner.hasNextDouble()) {
                a = scanner.nextDouble();
                ok = true;
            } else {
                System.out.println("Ошибка ввода. Введите число.");
                scanner.next();
            }
        }
        return a;
    }

    public static int inputN(Scanner scanner) {
        int n = 0;
        boolean ok = false;
        while (!ok) {
            System.out.print("Введите количество членов ряда N (> 0): ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (validateN(n)) {
                    ok = true;
                }
            } else {
                System.out.println("Ошибка ввода. Введите целое число.");
                scanner.next();
            }
        }
        return n;
    }

    public static double[] generateTerms(double a, int n) {
        double[] terms = new double[n];
        double current = a;
        for (int i = 0; i < n; i++) {
            terms[i] = current;
            current = current * (-a);
        }
        return terms;
    }

    public static double calculateSum(double[] terms) {
        double sum = 0;
        for (int i = 0; i < terms.length; i++) {
            sum += terms[i];
        }
        return sum;
    }

    public static void outputResult(double[] terms, double sum) {
        System.out.println("\n--- Результаты вычисления ---");
        System.out.println("Члены ряда: " + Arrays.toString(terms));
        System.out.printf("Сумма ряда: %.6f%n", sum);
        System.out.println("-----------------------------");
    }

    public static void showMenu() {
        System.out.println("\n========== ПРАКТИЧЕСКАЯ РАБОТА №3 ==========");
        System.out.println("1. Вычислить сумму ряда a - a^2 + a^3 - ...");
        System.out.println("2. Информация о разработчике");
        System.out.println("0. Выход");
        System.out.println("============================================");
        System.out.print("Выберите пункт: ");
    }

    public static void showDeveloper() {
        System.out.println("\n=== О разработчике ===");
        System.out.println("ФИО: Мнушко Виктория Сергеевна");
        System.out.println("Группа: РИ-250931");
        System.out.println("Университет: УрФУ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Добро пожаловать!");

        do {
            showMenu();

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        double a = inputA(scanner);
                        int n = inputN(scanner);
                        double[] termsArray = generateTerms(a, n);
                        double totalSum = calculateSum(termsArray);
                        outputResult(termsArray, totalSum);
                        break;
                    case 2:
                        showDeveloper();
                        break;
                    case 0:
                        System.out.println("Выход из программы. До свидания!");
                        break;
                    default:
                        System.out.println("Неверный пункт меню.");
                }
            } else {
                System.out.println("Ошибка ввода. Введите целое число.");
                scanner.next();
                choice = -1;
            }
        } while (choice != 0);

        scanner.close();
    }
}