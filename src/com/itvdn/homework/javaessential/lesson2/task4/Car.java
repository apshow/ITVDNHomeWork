package com.itvdn.homework.javaessential.lesson2.task4;

public class Car {
    int year;
    double speed;
    int weight;
    String color;

    Car(int year) {
        this.year = year;
    }

    Car(int year, double speed) {
        this(year);
        this.speed = speed;
    }

    Car(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
    }

    Car(int year, double speed, int weight, String color) {
        this(year, speed, weight);
        this.color = color;
    }
}

//        Задание 4
//        Используя Intelij IDEA создать проект, пакет.
//        (Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
//        Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
//        Перегрузить конструкторы вызывая конструктор из конструктора.
//        Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.
