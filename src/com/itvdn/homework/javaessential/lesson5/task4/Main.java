package com.itvdn.homework.javaessential.lesson5.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(5);
        num.add(7);

        System.out.println("Исходный список - " + num);
        ListIterator<Integer> li = num.listIterator();

        while (li.hasNext()){
            li.set(li.next() + 1);
        }

        System.out.println("Измененный список - " + num);
    }

}

//        Задание 4
//        Используя Intelij IDEA создать проект, пакет.
//        Создать класс Main, создать список целых чисел и используя ListIterator пройтись по списку
//        и увеличить значения на 1;
