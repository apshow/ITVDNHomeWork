package com.itvdn.homework.javaessential.lesson1.task2;

import java.util.Scanner;

public class Rectangle {
    double side1;
    double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    double areaCalculator(double side1, double side2) {
        return side1 * side2;
    }

    double perimeterCalculator(double side1, double side2) {
        return side1 * 2 + side2 * 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер одной стороны прямоугольника");
        double s1 = scanner.nextDouble();
        System.out.println("введите размер одной второй прямоугольника");
        double s2 = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(s1, s2);

        System.out.println("площадь прямоугольника равна " + rectangle.areaCalculator(s1, s2));
        System.out.println("периметр прямоугольника равнен " + rectangle.perimeterCalculator(s1, s2));

    }
}


//        Задание 2
//        Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем Rectangle.
//        В теле класса создать два поля, описывающие длины сторон double side1, double side2.
//        Создать два метода, вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2)
//        и периметр прямоугольника – double perimeterCalculator (double side1, double side2).
//        Написать программу, которая принимает от пользователя длины двух сторон прямоугольника и выводит на экран
//        периметр и площадь.

