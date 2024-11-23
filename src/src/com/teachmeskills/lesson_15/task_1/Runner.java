package com.teachmeskills.lesson_15.task_1;


/*Задача 1
Создать коллекцию целых чисел и заполнить ее значениями, введенными с консоли.
При заполнении коллекции числами с консоли следует делать приведения типа.
Код для привдения строки к числу можно использовать следующий:
int i = Integer.parseInt(str);
или
int val = Integer.valueOf(str);
Для окончания ввода введите слово "exit".
При приведении строки к числу, следует учитывать возможность исключений.*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers. To finish, enter 'exit':");

        while (true) {
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input: " + input + " is not an integer.");
            }
        }

        System.out.println("Numbers entered: " + numbers);
    }

}