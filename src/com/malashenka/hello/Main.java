package com.malashenka.hello;

import java.util.*;

//Составить алгоритм: если введенное число больше 7, то вывести “Привет”
//Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
//Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanNumber(scanner);
        scanString(scanner);
        scanArray(scanner);
    }

    private static void scanNumber(Scanner scanner) {
        if (isInteractive(scanner)) {
            System.out.println("Введите число");
        }
        if (scanner.hasNextLine()) {
            String nextInt = scanner.nextLine();
            try {
                int i = Integer.parseInt(nextInt);
                if (i > 7) {
                    System.out.println("Привет");
                } else {
                    System.out.println("Вы ввели число <= 7");
                }
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число.");
            }
        }
    }

    private static void scanString(Scanner scanner) {
        if (isInteractive(scanner)) {
            System.out.println("Введите имя");
        }
        if (scanner.hasNextLine()) {
            String username = scanner.nextLine();
            if ("Вячеслав".equals(username)) {
                System.out.println("Привет, " + username);
            } else {
                System.out.println("Нет такого имени");
            }
        }
    }

    private static void scanArray(Scanner scanner) {
        if (isInteractive(scanner)) {
            System.out.println("Введите числовой массив (числа через пробел)");
        }
        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] arr = line.split("\\s+");
            List<Integer> list = new ArrayList();
            try {
                for (String s : arr) {
                    int y = Integer.parseInt(s);
                    if (y % 3 == 0) {
                        list.add(y);
                    }
                }
                System.out.println("Среди введенных чисел седующие кратные 3: " + list);
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели некорректные данные");
            }
        }
    }

    private static boolean isInteractive(Scanner scanner) {
        System.out.println("Хотите работать в интерактивном режиме Y/N:");
        String interactive = scanner.nextLine();
        return "Y".equals(interactive);
    }
}
