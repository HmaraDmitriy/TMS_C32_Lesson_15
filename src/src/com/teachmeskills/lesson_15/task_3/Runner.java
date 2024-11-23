package com.teachmeskills.lesson_15.task_3;

/*Задача 3
Создать коллекцию целых чисел.
Заполните коллекцию рандомными числами.
Пусть размер коллекции задается с консоли.
Предусмотреть проверку введенного размера коллекции на валидность.
Посчитайте и выведите на экран среднее арифметическое все элементов коллекции.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int size;
        while (true) {
            System.out.println("Enter the collection size (positive number):");
            String input = scanner.nextLine();
            try {
                size = Integer.parseInt(input);
                if (size > 0) break;
                else System.out.println("The collection size must be greater than 0.");
            } catch (Exception e) {
                System.out.println("Incorrect input");
            }
        }

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(100));
        }

        System.out.println("Generated numbers: " + numbers);

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.size();

        System.out.println("Arithmetic mean: " + average);
    }
}
