package ru.university.lab2;

import ru.university.lab2.numbers.*;
import ru.university.lab2.arrays.*;
import ru.university.lab2.strings.*;
import ru.university.lab2.util.*;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Укажите номер задания 1-9 (0 - выход).");
            return;
        }

        switch (args[0]) {
            case "1" -> new Task01().run();
            case "2" -> new Task02().run();
            case "3" -> new Task03().run();
            case "4" -> new Task04().run();
            case "5" -> new Task05().run();
            case "6" -> new Task06().run();
            case "7" -> new Task07().run();
            case "8" -> new Task08().run();
            case "9" -> System.out.println("Задание выполнено успешно.");
            default -> System.out.println("Нет такого задания.");
        }
    }
}