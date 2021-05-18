package com.itvdn.homework.javastart.lesson7;

import java.util.Scanner;

public class Conversion {

    static void currencyConversion(int x, double course){
        System.out.println("результат конвертации: "  + (x * course));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("введите сумму в исходной валюте");
        String strX = sc.next();
        int x = Integer.parseInt(strX);

        System.out.println("введите курс конвертации");
        String strCourse = sc.next();
        double course = Double.parseDouble(strCourse);

        currencyConversion(x, course);

    }
}

//    Используя IntelliJ IDEA, создайте класс Conversion.
//    Напишите программу, которая будет выполнять конвертирование валют.
//    Пользователь вводит: сумму денег в определенной валюте, курс для конвертации в другую валюту.
//    Организуйте вывод результата операции конвертирования валюты на экран.

