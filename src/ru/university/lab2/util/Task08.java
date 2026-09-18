package ru.university.lab2.util;

import ru.university.lab2.numbers.*;
import ru.university.lab2.strings.*;
import ru.university.lab2.arrays.*;

import java.util.Scanner;

public class Task08 {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printHelp();
            System.out.print("Укажите номер задания 1-9 (0 - выход): ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Ошибка: введите целое число.");
                scanner.next();
                choice = -1;
            }

            switch (choice) {
                case 0 -> System.out.println("Выход.");
                case 1 -> new Task01().run();
                case 2 -> new Task02().run();
                case 3 -> new Task03().run();
                case 4 -> new Task04().run();
                case 5 -> new Task05().run();
                case 6 -> new Task06().run();
                case 7 -> new Task07().run();
                case 8 -> printHelp();
                case 9 -> System.out.println("Задание выполнено успешно.");
                default -> System.out.println("Нет такого задания.");
            }
        } while (choice != 0);
    }

    private void printHelp() {
        System.out.println("""
                ========== Лабораторная работа №1 ==========
                1 - Целочисленные ловушки
                2 - Вещественная арифметика
                3 - Побитовые операции
                4 - Обработка текста
                5 - Одномерные массивы
                6 - Многомерные массивы
                7 - Методы и передача аргументов
                8 - Консольное меню
                9 - Информация о сборке
                0 - Выход
                ===========================================
                """);
    }
}
