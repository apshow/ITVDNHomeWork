package com.itvdn.homework.javaessential.lesson5.task3;

import com.itvdn.homework.javaessential.lesson5.task2.Zoo;

import java.util.ArrayList;
import java.util.List;

public class ZooRemove {

    public static void main(String[] args) {
//TODO
        List<String> animals = new ArrayList<>();

        animals.add(0, "Lion");
        animals.add(1, "Cat");
        animals.add(2, "Dog");
        animals.add(3, "Snake");
        animals.add(4, "Tiger");
        animals.add(5, "Mouse");
        animals.add(6, "Bee");
        animals.add(7, "Ant");

        System.out.println( "Исходный размер списка = " + animals.size());

//        Zoo.animalList().remove(3);
//        Zoo.animalList().remove(5);
//        Zoo.animalList().remove(7);

        animals.remove("Snake");
        animals.remove("Mouse");
        animals.remove("Ant");

        System.out.println( "Размер списка после удаления = " + animals.size());

        for (Object o: animals) {
            System.out.println(o);
        }
    }
}

//        Задание 3
//        Используя Intelij IDEA создать проект, пакет.
//        Используя класс Zoo Задания 2, удалить 3, 5, 7 животные, узнать размер списка и вывести в консоль.
