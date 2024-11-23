package com.teachmeskills.lesson_15.task_4;

/*Задача 4
Создать коллекцию уникальных имен всех студентов нашей группы + преподаватель.
Вывести коллекцию на экран.*/


import com.teachmeskills.lesson_15.task_4.group.Members;

import java.util.LinkedList;

public class Runner {
    public static void main(String[] args) {

        Members members1 = new Members("Andreich",1,"m","Teacher");
        Members members2 = new Members("Dmitriy",2,"m","Student");
        Members members3 = new Members("Ilya",3,"m","Student");
        Members members4 = new Members("Flame",4,"m","Student");
        Members members5 = new Members("Igor",5,"m","Student");
        Members members6 = new Members("Marina",6,"w","Student");
        Members members7 = new Members("Daniil",7,"m","Student");
        Members members8 = new Members("Sultan",8,"m","Student");
        Members members9 = new Members("Georgi",9,"m","Student");
        Members members10 = new Members("Kirill",10,"m","Student");
        Members members11 = new Members("Kate",11,"w","Student");
        Members members12 = new Members("Dmitry",12,"m","Student");
        Members members13 = new Members("Rita",13,"w","Student");
        Members members14 = new Members("Vlad",14,"m","Student");
        Members members15 = new Members("Sergio",15,"m","Student");
        Members members16 = new Members("Flafic",16,"m","Student");
        Members members17 = new Members("Oleg",17,"m","Student");


        LinkedList<Members> list = new LinkedList<>();
        list.add(members1);
        list.add(members2);
        list.add(members3);
        list.add(members4);
        list.add(members5);
        list.add(members6);
        list.add(members7);
        list.add(members8);
        list.add(members9);
        list.add(members10);
        list.add(members11);
        list.add(members12);
        list.add(members13);
        list.add(members14);
        list.add(members15);
        list.add(members16);
        list.add(members17);

        for (Members member : list) {
            System.out.println(member);
        }

    }
}
