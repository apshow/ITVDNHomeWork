package com.itvdn.homework.javastart.lesson3;

public class ArithmeticAverage {

    public static void main(String[] args) {
        int x = 11, y = 11, z = 13;

        double average = (x + y + z) / 3; // проблема - не точное вычисление, лучше использование вещественных переменных
        System.out.println(average);
    }
}
