package com.itvdn.homework.javastart.courseproject;

import java.util.Scanner;

public class InversionNumber {

    public static long reverse(long num) {
        long input = num;
        long num1 = 0;

        while (input>0) {
            num1 = num1 * 10;
            num1 = num1 + input%10;
            input = input / 10;
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        long i = scanner.nextLong();
        System.out.println(reverse(i));

        scanner.close();
    }
}

//        Задача 2
//        Напишите метод, который принимает число, которое не содержит нулей и возвращает цифры в обратном порядке.
//        Например, на вход: 789 на выход: 987
//

