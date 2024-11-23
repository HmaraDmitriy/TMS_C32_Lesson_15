package com.teachmeskills.lesson_15.task_2;

/*Задача 2
Создать коллекцию фигур.
(взять классы для фигур из предыдущих домашних заданий)
Заполнить коллекцию различными фигурами.
Пройти циклом по коллекции и вызвать метод для подсчета и вывода на экран периметра каждой фигуры.*/

import com.teachmeskills.lesson_15.task_2.abstractFigure.Figure;
import com.teachmeskills.lesson_15.task_2.figure.Circle;
import com.teachmeskills.lesson_15.task_2.figure.Rectangle;
import com.teachmeskills.lesson_15.task_2.figure.Triangle;

import java.util.*;

public class Runner {
    public static void main(String[] args) {

        Circle circle1 = new Circle(9);
        Circle circle2 = new Circle(6);
        Rectangle rectangle1 = new Rectangle(5,9);
        Rectangle rectangle2 = new Rectangle(3,7);
        Triangle triangle1 = new Triangle(4,8,2);
        Triangle triangle2 = new Triangle(7,4,9);

     List<Figure> lists = new ArrayList<>();

     lists.add(circle1);
     lists.add(circle2);
     lists.add(rectangle1);
     lists.add(rectangle2);
     lists.add(triangle1);
     lists.add(triangle2);

        double totalPerimeter = 0;

        for (Figure list : lists) {
            System.out.println(list);
            totalPerimeter += list.getPerimeter();
        }
        System.out.println("Total Perimeter all Figures: " + totalPerimeter);
    }
}
