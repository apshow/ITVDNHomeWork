package com.itvdn.homework.javastart.courseproject;

import java.math.BigInteger;
import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        long i = scanner.nextLong();
        long j = i;
        int sum = 0;

        while (i != 0){
            sum += i % 10;
            i /= 10;
        }
        System.out.println("сумма цифр числа " + j + " равна " + sum);

        scanner.close();
    }
}

//        Задача 1
//        Напишите метод, который принимает число и возвращает сумму цифр данного числа
//
