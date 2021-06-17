package com.itvdn.homework.javaessential.lesson5.task2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static ArrayList animalList(){

        List<String> animals = new ArrayList<>();

        animals.add(0, "Lion");
        animals.add(1, "Cat");
        animals.add(2, "Dog");
        animals.add(3, "Snake");
        animals.add(4, "Tiger");
        animals.add(5, "Mouse");
        animals.add(6, "Bee");
        animals.add(7, "Ant");

        return (ArrayList) animals;
    }
}

//        Задание 2
//        Используя Intelij IDEA создать проект, пакет.
//        Создать класс Zoo. В классе создать список, в который записать 8 животных через метод add(index, element).
//        Вывести список в консоль.


